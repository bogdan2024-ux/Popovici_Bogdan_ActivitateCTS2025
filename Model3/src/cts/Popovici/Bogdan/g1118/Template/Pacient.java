package cts.Popovici.Bogdan.g1118.Template;

public class Pacient {

    private String nume;
    private boolean grav;


    public Pacient(String nume, boolean grav) {
        this.nume = nume;
        this.grav = grav;
    }

    public String getNume() {
        return nume;
    }

    public boolean eGrav() {
        return grav;
    }

}
