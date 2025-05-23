package cts.Popovici.Bogdan.g1118.ChainOfResponsability;

import java.util.List;

public interface ICautare {

    void setNext(ICautare next);

    List<Produs> filtrare(List<Produs> produse);

}
