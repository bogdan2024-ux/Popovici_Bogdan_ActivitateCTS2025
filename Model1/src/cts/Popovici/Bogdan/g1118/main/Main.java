package cts.Popovici.Bogdan.g1118.main;

import cts.Popovici.Bogdan.g1118.Composite.Continent;
import cts.Popovici.Bogdan.g1118.Composite.Tara;
import cts.Popovici.Bogdan.g1118.Composite.TulpiniVirus;
import cts.Popovici.Bogdan.g1118.Composite.Virus;
import cts.Popovici.Bogdan.g1118.Proxy.ISpital;
import cts.Popovici.Bogdan.g1118.Proxy.Pacient;
import cts.Popovici.Bogdan.g1118.Proxy.Spital;
import cts.Popovici.Bogdan.g1118.Proxy.SpitalProxy;

public class Main {
    public static void main(String[] args) {

        /*

        ISpital spital = new Spital();

        Pacient pacient1 = new Pacient("Andrei", true);
        Pacient pacient2 = new Pacient("Ana", true);
        Pacient pacient3 = new Pacient("Adrian", false);
        Pacient pacient4 = new Pacient("Marian", true);
        Pacient pacient5 = new Pacient("Mihai", true);
        Pacient pacient6 = new Pacient("Nicolae", true);
        Pacient pacient7 = new Pacient("Daniel", true);

        spital.vizita(pacient1);
        spital.vizita(pacient3);

        System.out.println("Verificare proxy:");

        ISpital spitalProxy = new SpitalProxy((Spital)spital);

        spitalProxy.vizita(pacient1);
        spitalProxy.vizita(pacient2);
        spitalProxy.vizita(pacient3);
        spitalProxy.vizita(pacient4);
        spitalProxy.vizita(pacient5);
        spitalProxy.vizita(pacient6);
        spitalProxy.vizita(pacient7);

        */

        Virus tulpina1 = new TulpiniVirus("tulpina1", 5);
        Virus tulpina2 = new TulpiniVirus("tulpina2", 15);
        Virus tulpina3 = new TulpiniVirus("tulpina3", 25);
        Virus tulpina4 = new TulpiniVirus("tulpina4", 35);
        Virus tulpina5 = new TulpiniVirus("tulpina5", 45);
        Virus tulpina6 = new TulpiniVirus("tulpina6", 55);

        Virus tara1 = new Tara("Tara1");
        Virus tara2 = new Tara("Tara2");
        Virus tara3 = new Tara("Tara3");

        Virus continent1 = new Continent("Continent1");
        Virus continent2 = new Continent("Continent2");

        tara1.adauga(tulpina1);
        tara1.adauga(tulpina2);

        tara2.adauga(tulpina3);
        tara2.adauga(tulpina4);

        tara3.adauga(tulpina5);
        tara3.adauga(tulpina6);
        tara3.adauga(tulpina1);

        continent1.adauga(tara1);
        continent1.adauga(tara2);

        continent2.adauga(tara3);

        continent1.afiseazaStructura();
        continent2.afiseazaStructura();

        System.out.println("Continentul 1 are " + continent1.getNrCazuri() + " cazuri");
        System.out.println("Continentul 2 are " + continent2.getNrCazuri() + " cazuri");

        tara1.adauga(continent1);
        continent1.adauga(continent2);

        continent2.sterge(tara3);
        continent2.afiseazaStructura();

        continent2.sterge(continent1);

    }
}