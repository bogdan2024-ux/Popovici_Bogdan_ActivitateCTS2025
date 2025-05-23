package cts.Popovici.Bogdan.g1118.Composite;

public class TulpiniVirus implements Virus {

    protected String nume;
    protected int nrCazuri;

    public TulpiniVirus(String nume, int nrCazuri) {
        this.nume = nume;
        this.nrCazuri = nrCazuri;
    }

    @Override
    public void adauga(Virus v) {
        throw new UnsupportedOperationException("Tulpina nu are subcategorii");
    }

    @Override
    public void sterge(Virus v) {
        throw new UnsupportedOperationException("Tulpina nu are subcategorii");
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Tulpina " + this.nume);
    }

    @Override
    public int getNrCazuri() {
        return nrCazuri;
    }
}
