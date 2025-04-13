import clase.Cafea;
import clase.CafeaCuLapte;
import clase.CafeaCuZahar;
import interfete.Bautura;

public class Main {
    public static void main(String[] args) {

        Bautura cafea = new Cafea();
        cafea = new CafeaCuLapte(cafea);
        cafea = new CafeaCuZahar(cafea);

        System.out.println("Comanda: " + cafea.nume());
        System.out.println("Preț total: " + cafea.pret() + " lei");
    }
}