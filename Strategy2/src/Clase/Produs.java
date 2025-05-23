package Clase;

public class Produs {

    private String name;
    private int calorii;
    private int carbohidrati;

    public Produs(String name, int calorii, int carbohidrati) {
        this.name = name;
        this.calorii = calorii;
        this.carbohidrati = carbohidrati;
    }


    public String getName() {
        return name;
    }

    public int getCalorii() {
        return calorii;
    }

    public int getCarbohidrati() {
        return carbohidrati;
    }

    @Override
    public String toString() {
        return this.name + " " + this.calorii + " calorii " + this.carbohidrati + " carbohidrati";
    }
}
