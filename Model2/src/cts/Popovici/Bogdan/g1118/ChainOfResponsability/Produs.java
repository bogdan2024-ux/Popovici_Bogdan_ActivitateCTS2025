package cts.Popovici.Bogdan.g1118.ChainOfResponsability;

public class Produs {

    private String nume;
    private String culoare;
    private int pret;

    public Produs(String nume, String culoare, int pret) {
        this.nume = nume;
        this.culoare = culoare;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getPret() {
        return pret;
    }
}
