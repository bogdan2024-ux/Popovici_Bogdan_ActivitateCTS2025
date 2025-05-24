import Clase.Client;
import Clase.Petrecere;
import Clase.PetrecereProxy;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client(15, "Andrei");
        Client c2 = new Client(25, "Nicolae");

        Petrecere p1 = new Petrecere();
        p1.inregistrare(c1);
        p1.inregistrare(c2);

        PetrecereProxy pp = new PetrecereProxy(p1);
        pp.inregistrare(c1);
        pp.inregistrare(c2);

    }
}