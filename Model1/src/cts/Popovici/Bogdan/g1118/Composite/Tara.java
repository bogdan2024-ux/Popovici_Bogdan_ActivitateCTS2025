package cts.Popovici.Bogdan.g1118.Composite;

import java.util.ArrayList;

public class Tara implements Virus {

    protected String nume;
    protected int nrCazuri;
    protected ArrayList<Virus> virusi;

    public Tara(String nume) {
        this.nume = nume;
        this.virusi = new ArrayList<>();
    }

    @Override
    public void adauga(Virus v) {
        if(v.getClass().equals(TulpiniVirus.class)) {
            virusi.add(v);
        } else {
            System.out.println("Nu se pot adauga decat tulpini");
        }
    }

    @Override
    public void sterge(Virus v) {
        if (virusi.contains(v)) {
            virusi.remove(v);
            System.out.println("S a eliminat tulpina");
        } else {
            System.out.println("Introduceti o tulpina valida");
        }
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Pentru tara " + this.nume + ":");
        for (Virus v : virusi) {
            v.afiseazaStructura();
        }
    }

    @Override
    public int getNrCazuri() {
        nrCazuri = 0;
        for (Virus v : virusi) {
            nrCazuri += v.getNrCazuri();
        }
   //     System.out.println("Numar cazuri in tara " + this.nume + ": " + nrCazuri);
        return nrCazuri;
    }
}
