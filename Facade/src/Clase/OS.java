package Clase;

public class OS {

    private boolean osLoaded;

    OS() {
        osLoaded = false;
    }

    void load() {
        System.out.println("incarcare OS");
        osLoaded = true;
    }

    boolean isOSLoaded() {
        return osLoaded;
    }

}
