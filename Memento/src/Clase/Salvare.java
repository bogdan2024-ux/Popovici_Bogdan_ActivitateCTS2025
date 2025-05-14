package Clase;

public class Salvare {

    private final int nivel;
    private final int hp;

    public Salvare(int nivel, int hp) {
        this.nivel = nivel;
        this.hp = hp;
    }

    public int getNivel() {
        return nivel;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Salvare nivel= " + nivel + ", hp= " + hp;
    }

}
