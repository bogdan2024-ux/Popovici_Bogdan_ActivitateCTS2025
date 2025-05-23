package Clase;

import Interfete.IPetrecere;

public class PetrecereProxy implements IPetrecere {

    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere) {
        this.petrecere = petrecere;
    }


    @Override
    public void inregistrare(Client c) {
        if(c.getVarsta() < 18) {
            System.out.println("Interzis minorilor");
        } else {
            petrecere.inregistrare(c);

        }
    }
}
