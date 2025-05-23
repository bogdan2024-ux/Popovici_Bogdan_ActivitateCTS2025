package cts.Popovici.Bogdan.g1118.Template;

public class ProtocolPrivat extends AbstractProtocol {
    @Override
    void esteGrav(Pacient p) {
        System.out.println("Este grav, se vor chema medici externi");
        internare(p);
    }
}
