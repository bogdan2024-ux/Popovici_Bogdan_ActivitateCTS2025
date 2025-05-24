import Clase.Bon;
import Clase.MesajFactory;

public class Main {
    public static void main(String[] args) {

        Bon bon1 = new Bon(100, 1);
        Bon bon2 = new Bon(200, 2);
        Bon bon3 = new Bon(300, 3);
        Bon bon4 = new Bon(400, 4);

        MesajFactory.getMesaj("Hello world").afiseazaBon(bon1);
        MesajFactory.getMesaj("Hello world").afiseazaBon(bon2);
        MesajFactory.getMesaj("Bye world").afiseazaBon(bon3);


    }
}