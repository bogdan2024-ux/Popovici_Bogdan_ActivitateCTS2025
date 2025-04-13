package clase;

import interfete.Bautura;

public abstract class DecoratorBautura implements Bautura {

    private Bautura bautura;

    public DecoratorBautura(Bautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public String nume() {
        return bautura.nume();
    }

    @Override
    public double pret() {
        return bautura.pret();
    }

}
