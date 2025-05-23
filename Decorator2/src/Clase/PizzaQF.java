package Clase;

import Interfete.IPizza;

public class PizzaQF implements IPizza {

    private int pret;
    private String nume;

    public PizzaQF(int pret) {
        this.pret = pret;
        this.nume = "QuattroFormaggi";
    }

    @Override
    public int getPret() {
        return pret;
    }

    @Override
    public String getDetalii() {
        return "Pizza " + nume + " costa " + pret;
    }


}
