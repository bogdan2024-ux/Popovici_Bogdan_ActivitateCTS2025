package Interfete;

import Clase.Comanda;

public interface IHandler {

    void setNext(IHandler next);
    IHandler getNext();
    void comanda(Comanda comanda);

}
