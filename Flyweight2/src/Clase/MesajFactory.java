package Clase;

import Interfete.IMesaj;

import java.util.HashMap;
import java.util.Map;

public class MesajFactory {

    private static Map<String, IMesaj> mesaje = new HashMap<>();

    public static IMesaj getMesaj(String string) {
        if(!mesaje.containsKey(string)) {
            mesaje.put(string, new Mesaj(string));
        }
        return mesaje.get(string);

    }

}
