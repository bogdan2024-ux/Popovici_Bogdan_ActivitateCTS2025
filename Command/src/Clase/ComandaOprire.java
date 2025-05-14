package Clase;

import Interfete.IComanda;

public class ComandaOprire implements IComanda {

    private Televizor tv;

    public ComandaOprire(Televizor tv) {
        this.tv = tv;
    }

    @Override
    public void executa() {
        this.tv.TV_Off();
    }

}
