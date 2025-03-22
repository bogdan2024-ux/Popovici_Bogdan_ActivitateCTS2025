import java.util.*;

public class CuptorMultiplu {

    private static Map<Integer, CuptorMultiplu> instances;
    private List<Preparat> listaAsteptare;
    private int gradeMax;
    private int id;

    private CuptorMultiplu(int id,int gradeMax) {
        this.gradeMax = gradeMax;
        this.id = id;
        this.listaAsteptare = new ArrayList<>();
    }

    public static CuptorMultiplu getInstance(int id, int gradeMax) {
        if (instances == null) {
            instances = new HashMap<Integer, CuptorMultiplu>();
        }
        if (!instances.containsKey(id)) {
            instances.put(id, new CuptorMultiplu(id, gradeMax));
        }
        return instances.get(id);
    }

    private int getTimp() {
        int timp = 0;
        if (listaAsteptare != null) {
            for (Preparat p:this.listaAsteptare) {
                timp += p.getTimp();
            }
        }

        return timp;
    }

    public static void addPreparat(Preparat p) {
        if(p!=null) {

            CuptorMultiplu c1 = instances.get(1);
            for (CuptorMultiplu c : instances.values()) {
                if (c.getTimp() < c1.getTimp()) {
                    c1 = c;
                }
            }
            c1.listaAsteptare.add(p);

        }

    }

    @Override
    public String toString() {
        return "Cuptor " + id + " [listaAsteptare=" + listaAsteptare + "]";
    }


}
