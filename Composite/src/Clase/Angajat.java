package Clase;

public class Angajat extends AngajatAbstract {

    public Angajat(String nume, String functie) {
        super(nume, functie);
    }

    @Override
    public void afiseaza() {
        System.out.println("nume: " + nume + " functie: " + functie);
    }

}
