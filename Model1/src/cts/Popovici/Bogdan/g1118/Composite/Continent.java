package cts.Popovici.Bogdan.g1118.Composite;

import java.util.ArrayList;

public class Continent implements Virus{

    private String nume;
    private int nrCazuri;
    private ArrayList<Virus> tari;

    public Continent(String nume) {
        this.nume = nume;
        this.tari = new ArrayList<>();
    }


    @Override
    public void adauga(Virus v) {
        if(v.getClass().equals(Tara.class)) {
            tari.add(v);
        } else {
            System.out.println("Nu se pot adauga decat tari");
        }
    }

    @Override
    public void sterge(Virus v) {
        if(tari.contains(v)) {
            tari.remove(v);
            System.out.println("S a eliminat tara");
        } else {
            System.out.println("Introduceti o tara valida");
        }
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Pentru continentul " + this.nume + ":");
        for (Virus v : tari) {
            v.afiseazaStructura();
        }
    }

    @Override
    public int getNrCazuri() {
        nrCazuri = 0;
        for (Virus v : tari) {
            nrCazuri += v.getNrCazuri();
        }
        return nrCazuri;
    }
}
