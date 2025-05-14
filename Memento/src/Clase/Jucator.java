package Clase;

public class Jucator {

    private int level;
    private int hp;

    public Jucator(int level, int hp) {
        this.level = level;
        this.hp = hp;
    }

    public void increaseLevel() {
        this.level+=1;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void decreaseHp() {
        if(this.hp>0) {
            this.hp-=1;
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void afiseaza() {
        System.out.println("Jucatorul de nivel " + level + ", are " + hp + " hp");
    }

    public Salvare salveazaJucator() {
        return new Salvare(this.level, this.hp);
    }

    public void restaureazaJucator(Salvare salvare) {
        this.level = salvare.getNivel();
        this.hp = salvare.getHp();
    }
}
