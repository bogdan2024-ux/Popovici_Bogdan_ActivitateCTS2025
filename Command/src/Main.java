import Clase.ComandaOprire;
import Clase.ComandaPornire;
import Clase.Telecomanda;
import Clase.Televizor;
import Interfete.IComanda;

public class Main {
    public static void main(String[] args) {

        Televizor tv = new Televizor(1);

        IComanda c1 = new ComandaPornire(tv);
        IComanda c2 = new ComandaOprire(tv);

        Telecomanda telecomanda = new Telecomanda();

        System.out.println(tv);
        telecomanda.trimiteComanda(c1);
        System.out.println(tv);

        telecomanda.trimiteComanda(c2);
        System.out.println(tv);

        Televizor tv2 = new Televizor(2);
        IComanda c21 = new ComandaPornire(tv);
        IComanda c22 = new ComandaOprire(tv);

        System.out.println(tv2);
        telecomanda.trimiteComanda(c21);
        System.out.println(tv);
        System.out.println(tv2);




    }
}