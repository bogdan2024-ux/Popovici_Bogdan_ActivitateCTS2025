package Clase;

public class Client {

    String nume;
    int costTotal;

    public Client(String nume, int costTotal) {
        this.nume = nume;
        this.costTotal = costTotal;
    }

    public int getCostTotal() {
        return costTotal;
    }
}
