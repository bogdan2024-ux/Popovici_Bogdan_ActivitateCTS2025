package cts.Popovici.Bogdan.g1118.Main;

import cts.Popovici.Bogdan.g1118.Template.*;

public class Main {
    public static void main(String[] args) {

        Pacient p1 = new Pacient("Andrei", true);
        Pacient p2 = new Pacient("Ana", true);
        Pacient p3 = new Pacient("Nae", true);
        Pacient p4 = new Pacient("Mihai", false);

        AbstractSpital spitalPrivat1 = new SpitalPrivat("Privat 1");
        AbstractSpital spitalPrivat2 = new SpitalPrivat("Privat 2");
        AbstractSpital spitalStat2 = new SpitalStat("Stat 2", 1);
        AbstractSpital spitalStat1 = new SpitalStat("Stat 1", 1);


        AbstractProtocol protocolPrivat = new ProtocolPrivat();
        AbstractProtocol protocolStat = new ProtocolStat();

        protocolStat.checkPatient(p1);
        protocolPrivat.checkPatient(p2);
        protocolStat.checkPatient(p3);
        protocolStat.checkPatient(p4);



    }
}