package clase;

import interfete.Bautura;

public class Cafea implements Bautura {

    @Override
    public String nume() {
        return "cafea";
    }

    @Override
    public double pret() {
        return 3;
    }
}
