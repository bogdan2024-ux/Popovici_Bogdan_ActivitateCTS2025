package cts.Popovici.Bogdan.g1118.ChainOfResponsability;

import java.util.List;

public class Magazin {

    private List<Produs> produse;
    private ICautare cautarePret;
    private ICautare cautareCuloare;

    public Magazin(List<Produs> produse) {
        this.produse = produse;
    }


    public void setOrder() {
        cautareCuloare.setNext(cautarePret);
    }

    public List<Produs> getProduse(int pret) {
        cautarePret = new CautarePret(pret);
        cautareCuloare = new CautareCuloare();
        setOrder();
        return cautareCuloare.filtrare(produse);
    }

    public List<Produs> getProduse(String culoare){
        cautarePret = new CautarePret();
        cautareCuloare = new CautareCuloare(culoare);
        setOrder();
        return cautareCuloare.filtrare(produse);
    }

    public List<Produs> getProduse(int pret, String culoare) {
        cautarePret = new CautarePret(pret);
        cautareCuloare = new CautareCuloare(culoare);
        setOrder();
        return cautareCuloare.filtrare(produse);
    }

    public List<Produs> getProduse() {
        return produse;
    }
}
