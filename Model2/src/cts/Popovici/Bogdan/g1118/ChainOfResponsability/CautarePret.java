package cts.Popovici.Bogdan.g1118.ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class CautarePret implements ICautare{

    private ICautare next;
    private int pret;

    public CautarePret() {
        this.pret = -1;
    }

    public CautarePret(int pret) {
        this.pret = pret;
    }

    @Override
    public void setNext(ICautare next) {
        this.next = next;
    }

    @Override
    public List<Produs> filtrare(List<Produs> produse) {
        List<Produs> listaFiltrata = new ArrayList<Produs>();
        if (this.pret != -1) {
            for (Produs prod : produse) {
                if(prod.getPret()<pret){
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
