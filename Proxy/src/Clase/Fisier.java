package Clase;

import Interfete.IFisier;

public class Fisier implements IFisier {

    private String nume;

    public Fisier(String nume) {
        this.nume = nume;
    }

    @Override
    public void deschide() {
        System.out.println("Deschid fișierul: " + nume);
    }

}
