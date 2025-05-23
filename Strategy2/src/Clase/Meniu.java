package Clase;

import Interfete.Strategie;

import java.util.ArrayList;

public class Meniu {

    private ArrayList<Produs> produse = new ArrayList<Produs>();
    private Strategie strat;

    public Meniu addProdus(Produs produs) {
        produse.add(produs);
        return this;
    }

    public Strategie getStrat() {
        return strat;
    }

    public void setStrat(Strategie strat) {
        this.strat = strat;
    }

    public ArrayList<Produs> getProduse(){
        return produse;
    }

    public ArrayList<Produs> getProduseStrat(){
        if(strat!=null) {
            return strat.filtreaza(produse);
        }
        throw new UnsupportedOperationException();

    }

}
