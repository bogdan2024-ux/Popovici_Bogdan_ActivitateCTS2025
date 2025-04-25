package Clase;

import Interfete.Printable;

public class Imprimanta implements Printable {

    private String toPrint;

    public Imprimanta(String toPrint) {
        this.toPrint = toPrint;

    }
    @Override
    public void descriere() {
        System.out.println("Imprimanta");
    }

    @Override
    public void print() {
        System.out.println(this.toPrint);
    }
}
