package cts.Popovici.Bogdan.g1118.Template;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpital {

    protected static List<AbstractSpital> spitale = new ArrayList<AbstractSpital>();

    private String nume;

    public AbstractSpital(String nume) {
        this.nume = nume;
        spitale.add(this);
    }

    public String getNume() {
        return nume;
    }



}
