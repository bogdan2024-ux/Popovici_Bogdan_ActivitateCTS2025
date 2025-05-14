package Clase;

public class Televizor {

    private int id;
    private boolean onOff = false;

    public Televizor(int id) {
        this.id = id;
    }

    public void TV_On() {
        onOff = true;
    }

    public void TV_Off() {
        onOff = false;
    }

    @Override
    public String toString() {
        return "Televizor " + id + " este " + (onOff ? "pornit" : "oprit");
    }

}
