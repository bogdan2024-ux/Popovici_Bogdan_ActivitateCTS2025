import Clase.Jucator;
import Clase.ManagerSalvari;

public class Main {
    public static void main(String[] args) throws Exception {

        Jucator Andrei = new Jucator(1, 100);
        ManagerSalvari salvari = new ManagerSalvari();

    //    salvari.getLastSalvare();

        Andrei.afiseaza();

        salvari.salveaza(Andrei.salveazaJucator());
        System.out.println(salvari.getLastSalvare());

        salvari.salveaza(Andrei.salveazaJucator());

        Andrei.increaseLevel();
        Andrei.setHp(60);
        Andrei.afiseaza();

        salvari.salveaza(Andrei.salveazaJucator());

        System.out.println(salvari.getSalvare(1));

        Andrei.restaureazaJucator(salvari.getSalvare(0));
        Andrei.afiseaza();

    }
}