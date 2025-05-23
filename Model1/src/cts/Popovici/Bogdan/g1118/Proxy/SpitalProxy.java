package cts.Popovici.Bogdan.g1118.Proxy;

import java.util.ArrayList;

public class SpitalProxy implements ISpital {

    private Spital spital;
    private ArrayList<Pacient> listaDeAsteptare;

    public SpitalProxy(Spital spital) {
        this.spital = spital;
        this.listaDeAsteptare = new ArrayList<Pacient>();
    }

    @Override
    public void vizita(Pacient pacient) {
        listaDeAsteptare.add(pacient);
        if(listaDeAsteptare.size()<5) {
            System.out.println("Se asteapta inca " + (5 - listaDeAsteptare.size()) + " pacienti");
        } else {
            for(Pacient p : listaDeAsteptare) {
                spital.vizita(p);
            }
            listaDeAsteptare.clear();
        }
    }
}
