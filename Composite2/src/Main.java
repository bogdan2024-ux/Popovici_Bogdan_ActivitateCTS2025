import Clase.Categorie;
import Clase.Produs;
import Interfete.INod;

public class Main {
    public static void main(String[] args) {

        INod pizza = new Produs(50, "Pizza");
        INod burger = new Produs(40, "Burger");

        INod bere = new Produs(30, "Bere");
        INod apa = new Produs(10, "Apa");

        INod mancare = new Categorie("Mancare");
        INod bautura = new Categorie("Bautura");

        mancare.adaugaNod(pizza);
        mancare.adaugaNod(burger);

        bautura.adaugaNod(bere);
        bautura.adaugaNod(apa);

        System.out.println(mancare);
        System.out.println("Pret mancare = " + mancare.getPret());

        INod meniu = new Categorie("Meniu");
        meniu.adaugaNod(mancare);
        meniu.adaugaNod(bautura);

        System.out.println(meniu);


    }
}