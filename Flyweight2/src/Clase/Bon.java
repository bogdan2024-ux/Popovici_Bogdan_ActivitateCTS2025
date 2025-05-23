package Clase;

public class Bon {

    private int valoarePlata;
    private int masa;
    private int nr;
    private static int count = 1;

    public Bon(int valoarePlata, int masa) {
        this.valoarePlata = valoarePlata;
        this.masa = masa;
        nr = count++;
    }

    public int getNr() {
        return nr;
    }

    public int getMasa() {
        return masa;
    }

    public int getValoarePlata() {
        return valoarePlata;
    }
}
