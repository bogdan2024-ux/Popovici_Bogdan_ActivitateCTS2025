package cts.Popovici.Bogdan.g1118.Template;

public class SpitalStat extends AbstractSpital {

    private int locuriLibere;


    public SpitalStat(String nume, int locuriLibere) {
        super(nume);
        this.locuriLibere = locuriLibere;

    }

    public int getLocuriLibere() {
        return locuriLibere;
    }

    public void setLocuriLibere(int locuriLibere) {
        this.locuriLibere = locuriLibere;
    }

}
