package cts.Popovici.Bogdan.g1118.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class CautareCuloare implements ICautare {

    private ICautare next;
    private String culoare;

    public CautareCuloare() {
        this.culoare = "nope";
    }

    public CautareCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void setNext(ICautare next) {
        this.next = next;
    }

    @Override
    public List<Produs> filtrare(List<Produs> produse) {
        List<Produs> listaFiltrata = new ArrayList<Produs>();
        if (this.culoare != "nope") {
            for (Produs prod : produse) {
                if (prod.getCuloare().equals(culoare)) {
                    listaFiltrata.add(prod);
                }
            }
        } else {
            listaFiltrata = produse;
        }
        if (next!=null) {
            return next.filtrare(listaFiltrata);
        }
        return listaFiltrata;
    }
}
