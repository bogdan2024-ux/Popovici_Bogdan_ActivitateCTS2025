import Clase.AEvaluare;
import Clase.EvaluareBucatarie;
import Clase.EvaluareToalete;

public class Main {
    public static void main(String[] args) {


        AEvaluare evaluareBucatarie = new EvaluareBucatarie();
        AEvaluare evaluareToalete = new EvaluareToalete();

        evaluareToalete.evaluare();
        evaluareBucatarie.evaluare();

    }
}