package Clase;

import Interfete.IHandler;

public class Bucatar implements IHandler {

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
        if(!comanda.EMancare()) {
            System.out.println("Comanda invalida");
        } else {
            System.out.println("Bucatarul a procesat comanda");
        }
    }
}
