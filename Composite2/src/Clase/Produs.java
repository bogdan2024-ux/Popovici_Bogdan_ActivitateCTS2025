package Clase;

import Interfete.INod;

public class Produs implements INod {

    private int pret;
    private String nume;

    public Produs(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eleminaNod(INod nod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public INod getNod(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "\nProdus [pret=" + pret + ", nume=" + nume + "]";
    }
}
