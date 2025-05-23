package Clase;

import Interfete.IHandler;

public class Ospatar implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler next) {
        this.next = next;
    }

    @Override
    public IHandler getNext() {
        return this.next;
    }

    @Override
    public void comanda(Comanda comanda) {
        if(comanda.EMancare() && next!=null) {
            System.out.println("Bucatarul va procesa comanda de " + comanda.getProdus());
            next.comanda(comanda);
        } else {
            System.out.println("Ospatarul a procesat comanda de " + comanda.getProdus());
        }
    }
}
