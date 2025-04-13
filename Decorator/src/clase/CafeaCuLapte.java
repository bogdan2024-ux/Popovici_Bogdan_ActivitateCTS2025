package clase;

import interfete.Bautura;

public class CafeaCuLapte extends DecoratorBautura {

    public CafeaCuLapte(Bautura b) {
        super(b);
    }

    @Override
    public String nume(){
        return super.nume() + " cu lapte";
    }

    @Override
    public double pret(){
        return super.pret() + 1;
    }

}
