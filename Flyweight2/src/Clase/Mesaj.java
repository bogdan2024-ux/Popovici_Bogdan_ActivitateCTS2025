package Clase;

import Interfete.IMesaj;

public class Mesaj implements IMesaj {

    private String text;

    public Mesaj(String text) {
        this.text = text;
    }

    @Override
    public void afiseazaBon(Bon bon) {
        System.out.println("Bonul nr " + bon.getNr() + " de la masa " + bon.getMasa() + " are valoarea " + bon.getValoarePlata());
        System.out.println(text);
    }
}
