package Clase;

import Interfete.INod;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements INod {

    private String nume;
    private List<INod> produse;

    public Categorie(String nume) {
        produse = new ArrayList<>();
        this.nume = nume;
    }




    @Override
    public void adaugaNod(INod nod) {
        produse.add(nod);
    }

    @Override
    public void eleminaNod(INod nod) {
        produse.remove(nod);
    }

    @Override
    public INod getNod(int i) {
        return produse.get(i);
    }

    @Override
    public int getPret() {
        int pret = 0;
        for (INod produs : produse) {
            pret += produs.getPret();
        }
        return pret;
    }

    @Override
    public String toString() {
        String toReturn = "\n" + nume;
        for (INod produs : produse) {
            toReturn += produs.toString();
        }
        return toReturn;
    }
}
