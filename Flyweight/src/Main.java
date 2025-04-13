import clase.Masina;
import clase.MasinaFactory;

public class Main {
    public static void main(String[] args) {

        Masina m1 = MasinaFactory.getMasina("Dacia", "Logan", "alb");
        m1.afiseaza("B-123-ABC", 12);

        Masina m2 = MasinaFactory.getMasina("Dacia", "Logan", "alb");
        m2.afiseaza("B-456-XYZ", 34);

        Masina m3 = MasinaFactory.getMasina("BMW", "X5", "negru");
        m3.afiseaza("CJ-999-ZZZ", 5);


        System.out.println((m1 == m2));
    }
}