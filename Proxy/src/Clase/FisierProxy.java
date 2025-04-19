package Clase;

import Interfete.IFisier;

public class FisierProxy implements IFisier {

    private String nume;
    private boolean arePermisiune;

    public FisierProxy(String nume, boolean arePermisiune) {
        this.nume = nume;
        this.arePermisiune = arePermisiune;
    }

    @Override
    public void deschide() {
        if (arePermisiune) {
            Fisier fisier = new Fisier(nume);
            fisier.deschide();
        } else {
            System.out.println("Acces interzis la fișierul: " + nume);
        }
    }

}
