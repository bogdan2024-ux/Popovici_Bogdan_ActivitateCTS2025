package Clase;

public class Comanda {

    private String produs;
    private boolean eMancare;

    public Comanda(String produs, boolean eMancare) {
        this.produs = produs;
        this.eMancare = eMancare;
    }

    public String getProdus() {
        return produs;
    }

    public boolean EMancare() {
        return eMancare;
    }

}
