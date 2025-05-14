package Clase;

import Interfete.IComanda;

public class Telecomanda {

    public void trimiteComanda(IComanda comanda) {
        comanda.executa();
    }

}
