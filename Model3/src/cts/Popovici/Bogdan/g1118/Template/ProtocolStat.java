package cts.Popovici.Bogdan.g1118.Template;

public class ProtocolStat extends AbstractProtocol {
    @Override
    void esteGrav(Pacient p) {
        System.out.println("Este grav, se vor chema medici locali");
        internare(p);
    }


}
