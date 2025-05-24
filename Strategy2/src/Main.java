import Clase.Meniu;
import Clase.Produs;
import Clase.StrategieCalorii;
import Clase.StrategieCarbohidrati;

public class Main {
    public static void main(String[] args) {


        Produs p1 = new Produs("Produs 1", 100, 100);
        Produs p2 = new Produs("Produs 2", 20, 80);
        Produs p3 = new Produs("Produs 3", 70, 30);
        Produs p4 = new Produs("Produs 4", 40, 40);

        Meniu meniu = new Meniu();
        meniu.addProdus(p1).addProdus(p2).addProdus(p3).addProdus(p4);

        System.out.println(meniu.getProduse());
        //System.out.println(meniu.getProduseStrat());

        meniu.setStrat(new StrategieCalorii());
        System.out.println(meniu.getStrat() + " " + meniu.getProduseStrat());

        meniu.setStrat(new StrategieCarbohidrati());
        System.out.println(meniu.getStrat() + " " + meniu.getProduseStrat());

    }
}