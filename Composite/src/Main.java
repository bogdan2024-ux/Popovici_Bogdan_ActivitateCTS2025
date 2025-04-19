import Clase.AngajatAbstract;
import Clase.Manager;
import Clase.Angajat;

public class Main {
    public static void main(String[] args) {

        AngajatAbstract director = new Manager("Ion Ionescu", "director");
        AngajatAbstract viceDirector = new Manager("Nea Nae", "vice-director");

        AngajatAbstract angajat1 = new Angajat("Popa Popescu", "angajat1");
        AngajatAbstract angajat2 = new Angajat("Adi Popescu", "angajat2");
        AngajatAbstract angajat3 = new Angajat("Gica Popescu", "angajat3");



        director.adauga(viceDirector);
        director.adauga(angajat1);
        viceDirector.adauga(angajat2);
        viceDirector.adauga(angajat3);

        director.afiseaza();
        viceDirector.afiseaza();
        angajat1.afiseaza();


    }
}