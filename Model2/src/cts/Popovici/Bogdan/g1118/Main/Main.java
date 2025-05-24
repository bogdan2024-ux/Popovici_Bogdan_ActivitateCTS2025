package cts.Popovici.Bogdan.g1118.Main;

import cts.Popovici.Bogdan.g1118.ChainOfResponsability.Magazin;
import cts.Popovici.Bogdan.g1118.ChainOfResponsability.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produs p1 = new Produs("Produs1", "Negru", 100);
        Produs p2 = new Produs("Produs2", "Negru", 10);
        Produs p3 = new Produs("Produs3", "Alb", 200);
        Produs p4 = new Produs("Produs4", "Alb", 20);
        Produs p5 = new Produs("Produs5", "Rosu", 300);
        Produs p6 = new Produs("Produs6", "Rosu", 30);
        Produs p7 = new Produs("Produs7", "Rosu", 3);

        List<Produs> produse = new ArrayList<Produs>();
        produse.add(p1);
        produse.add(p2);
        produse.add(p3);
        produse.add(p4);
        produse.add(p5);
        produse.add(p6);
        produse.add(p7);

        Magazin magazin = new Magazin(produse);
/*
        produse = magazin.getProduse();
        for (Produs p : produse) {
            System.out.println(p.getNume());
        }

 */

        System.out.println("Verificare filtrare doar pret:");
        produse = magazin.getProduse(50);
        for (Produs p : produse) {
            System.out.println(p.getNume());
        }

        System.out.println("Verificare filtrare doar culoare:");
        produse = magazin.getProduse("Negru");
        for (Produs p : produse) {
            System.out.println(p.getNume());
        }

        System.out.println("Verificare filtrare pret si culoare:");
        produse = magazin.getProduse(50, "Negru");
        for (Produs p : produse) {
            System.out.println(p.getNume());
        }

    }
}