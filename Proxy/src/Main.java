import Clase.Fisier;
import Clase.FisierProxy;

public class Main {
    public static void main(String[] args) {

        Fisier fisier = new Fisier("contract.txt");
        fisier.deschide();


        FisierProxy fisier1 = new FisierProxy("contract1.txt", true);
        fisier1.deschide();  // utilizator cu acces

        FisierProxy fisier2 = new FisierProxy("contract2.txt", false);
        fisier2.deschide();  // utilizator fără acces


    }
}