package Clase;

import Interfete.IPetrecere;

public class Petrecere implements IPetrecere {


    @Override
    public void inregistrare(Client c) {
        System.out.println("Clientul " + c.getNume() + " a fost inregistrat");
    }
}
