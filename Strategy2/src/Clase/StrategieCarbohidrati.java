package Clase;

import Interfete.Strategie;

import java.util.ArrayList;

public class StrategieCarbohidrati implements Strategie {

    @Override
    public ArrayList<Produs> filtreaza(ArrayList<Produs> produse) {
        ArrayList<Produs> filtrate = new ArrayList<>();
        for (Produs prod : produse) {
            if(prod.getCarbohidrati()<50) {
                filtrate.add(prod);
            }
        }
        return filtrate;
    }

    @Override
    public String toString() {
        return "StrategieCalorii";
    }
}
