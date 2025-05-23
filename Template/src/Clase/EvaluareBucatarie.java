package Clase;

public class EvaluareBucatarie extends AEvaluare{
    @Override
    void identificareDauna() {
        System.out.println("Identificare daune bucatarie");
    }

    @Override
    void evaluareInitialaDauna() {
        System.out.println("Evaluare initiala daune bucatarie");
    }

    @Override
    void trimitereEvaluareManager() {
        System.out.println("Trimitere evaluare bucatarie catre manager");
    }
}
