package Clase;

import Interfete.Printable;

public class AdaptorImprimanta extends ImprimantaVeche implements Printable {

    public AdaptorImprimanta(String toPrint) {
        super(toPrint);
    }

    @Override
    public void descriere() {
        System.out.println("Imprimanta Veche");
    }

    @Override
    public void print() {
        super.tipareste();
    }

}
