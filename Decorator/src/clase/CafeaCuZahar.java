package clase;

import interfete.Bautura;

public class CafeaCuZahar extends DecoratorBautura {

    public CafeaCuZahar(Bautura b) {
        super(b);
    }

    @Override
    public String nume(){
        return super.nume() + " cu zahar";
    }

    @Override
    public double pret(){
        return super.pret() + 0.5;
    }

}
