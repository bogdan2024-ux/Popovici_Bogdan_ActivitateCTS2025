package cts.Popovici.Bogdan.g1118.Proxy;

public class Pacient {

    private String nume;
    private boolean scrisoare;

    public Pacient(String nume, boolean scrisoare) {
        this.nume = nume;
        this.scrisoare = scrisoare;
    }

    public String getNume() {
        return nume;
    }

    public boolean getScrisoare() {
        return scrisoare;
    }
}
