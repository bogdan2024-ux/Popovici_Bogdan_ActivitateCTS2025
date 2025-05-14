package Clase;

import Interfete.IComanda;

public class ComandaPornire implements IComanda  {

    private Televizor tv;

    public ComandaPornire(Televizor tv) {
        this.tv = tv;
    }

    @Override
    public void executa() {
        this.tv.TV_On();
    }

}
