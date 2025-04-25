import Clase.AdaptorImprimanta;
import Clase.Imprimanta;
import Clase.ImprimantaVeche;
import Interfete.Printable;

import java.io.PrintStream;

public class Main {


    public static void printeaza(Printable printable) {
        System.out.println("Descriere:");
        printable.descriere();
        System.out.println("Text:");
        printable.print();

    }


    public static void main(String[] args) {

        Printable newImp = new Imprimanta("test imprimanta");
        printeaza(newImp);

        Printable oldImp = new AdaptorImprimanta("test imprimanta veche");
        printeaza(oldImp);






    }
}