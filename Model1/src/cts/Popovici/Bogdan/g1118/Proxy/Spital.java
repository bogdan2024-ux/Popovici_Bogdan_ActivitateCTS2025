package cts.Popovici.Bogdan.g1118.Proxy;

public class Spital implements ISpital{


    @Override
    public void vizita(Pacient pacient) {
        if(pacient.getScrisoare()) {
            System.out.println("Pacientul " + pacient.getNume() + " a vizitat spitalul");
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu are scrisoare de la medic");

        }
    }
}
