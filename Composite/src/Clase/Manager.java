package Clase;

import java.util.ArrayList;
import java.util.List;

public class Manager extends AngajatAbstract {

    private List<AngajatAbstract> subordonati;

    public Manager(String nume, String functie) {
        super(nume, functie);
        subordonati = new ArrayList<AngajatAbstract>();
    }

    @Override
    public void adauga(AngajatAbstract a) {
        subordonati.add(a);
    }

    @Override
    public void sterge(AngajatAbstract a) {
        subordonati.remove(a);
    }

    @Override
    public AngajatAbstract getSubordonat(int index) {
        return subordonati.get(index);
    }

    @Override
    public void afiseaza() {
        System.out.println("nume: " + nume + " functie: " + functie);
   //     for (AngajatAbstract a : subordonati) {
     //       a.afiseaza(nivel + 1);
       // }
    }

}
