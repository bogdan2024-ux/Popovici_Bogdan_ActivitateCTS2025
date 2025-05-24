import Clase.Bucatar;
import Clase.Comanda;
import Clase.Ospatar;
import Interfete.IHandler;

public class Main {
    public static void main(String[] args) {

        Comanda comanda1 = new Comanda("Apa", false);
        Comanda comanda2 = new Comanda("Paine", true);

        IHandler bucatar = new Bucatar();
        IHandler ospatar = new Ospatar();

        ospatar.setNext(bucatar);

        ospatar.comanda(comanda1);
        ospatar.comanda(comanda2);

        bucatar.comanda(comanda1);
        bucatar.comanda(comanda2);

    }
}