package clase;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private static final Map<String, Masina> masini = new HashMap<>();

    public static Masina getMasina(String marca, String model, String culoare) {
        String cheie = marca + "-" + model + "-" + culoare;
        if (!masini.containsKey(cheie)) {
            masini.put(cheie, new Masina(marca, model, culoare));
            System.out.println("Creată instanță pentru: " + cheie);
        }
        return masini.get(cheie);
    }
}
