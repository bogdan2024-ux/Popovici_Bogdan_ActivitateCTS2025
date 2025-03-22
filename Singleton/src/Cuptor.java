import java.util.ArrayList;
import java.util.List;

public class Cuptor implements Cloneable {

    private static Cuptor instance;
    private List<Preparat> listaAsteptare;
    private int gradeMax;


    private Cuptor(int gradeMax) {
        this.gradeMax = gradeMax;
        this.listaAsteptare = new ArrayList<>();
    }

    public static Cuptor getInstance(int gradeMax) {
        if (instance == null) {
            instance = new Cuptor(gradeMax);
        }
        return instance;
    }

    public void addPreparat(Preparat p) {
        if(p!=null && p.getGrade() <= this.gradeMax) {
            this.listaAsteptare.add(p);
        }
    }

    @Override
    public String toString() {
        return "Cuptor cu " + gradeMax + " grade [listaAsteptare=" + listaAsteptare + "]";
    }


    @Override
    public Cuptor clone() {
        try {
            Cuptor clone = (Cuptor) super.clone();
            clone.listaAsteptare = new ArrayList<>();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
