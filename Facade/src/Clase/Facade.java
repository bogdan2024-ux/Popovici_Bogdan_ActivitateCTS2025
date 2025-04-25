package Clase;

public class Facade {


    private Bios bios;
    private Storage storage;
    private OS os;

    public Facade() {
        this.bios = new Bios();
        this.storage = new Storage();
        this.os = new OS();
    }

    public void powerOn() {
        bios.init();
        storage.readInit();
        os.load();
        System.out.println("Calculator pornit");
    }

    public void checkPC() {
        if(bios.isBiosLoaded()){
            System.out.println("BIOS incarcat");
        } else {
            System.out.println("BIOS neincarcat");
        }
        if(os.isOSLoaded()) {
            System.out.println("OS incarcat");
        } else {
            System.out.println("OS neincarcat");
        }
    }
}
