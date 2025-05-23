package Clase;

import Interfete.IPizza;

public class PizzaRoma implements IPizza {

    private int pret;
    private String nume;

    public PizzaRoma(int pret) {
        this.pret = pret;
        this.nume = "Roma";
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
