package Clase;

public abstract class AngajatAbstract {

    protected String nume;
    protected String functie;

    public AngajatAbstract(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
    }

    public void adauga(AngajatAbstract p) {
        throw new UnsupportedOperationException();
    }

    public void sterge(AngajatAbstract p) {
        throw new UnsupportedOperationException();
    }

    public AngajatAbstract getSubordonat(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract void afiseaza();

}
