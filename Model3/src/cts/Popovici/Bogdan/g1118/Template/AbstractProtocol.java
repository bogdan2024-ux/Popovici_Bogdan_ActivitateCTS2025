package cts.Popovici.Bogdan.g1118.Template;

public abstract class AbstractProtocol {

    void verificaGravitate(Pacient p) {
        if (p.eGrav()) {
            esteGrav(p);
        } else {
            nuEsteGrav(p);
        }
    }

    abstract void esteGrav(Pacient p);

    void nuEsteGrav(Pacient p) {
        System.out.println("Nu este grav, se va face o programare la medicul de familie");
    }

    void internare(Pacient p) {
        boolean areLoc = false;



        for (AbstractSpital a : AbstractSpital.spitale) {
            if(a.getClass().equals(SpitalStat.class)) {
                SpitalStat sp = (SpitalStat) a;
                if(sp.getLocuriLibere()>0) {
                    sp.setLocuriLibere(sp.getLocuriLibere() - 1);
                    System.out.println("Pacientul " + p.getNume() + " a fost internat la spitalul " + a.getNume());
                    areLoc = true;
                    break;
                }
            }
        }
        if(!areLoc) {
            System.out.println("Nu exista niciun loc disponibil, rip " + p.getNume());
        }
    }

    public void checkPatient(Pacient p) {
        verificaGravitate(p);
    }
}
