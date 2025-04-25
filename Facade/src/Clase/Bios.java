package Clase;

public class Bios {

    private boolean biosLoaded;

    Bios() {
        biosLoaded = false;
    }


    void init() {
        System.out.println("initializare BIOS");
        biosLoaded = true;
    }

    boolean isBiosLoaded() {
        return biosLoaded;
    }

}
