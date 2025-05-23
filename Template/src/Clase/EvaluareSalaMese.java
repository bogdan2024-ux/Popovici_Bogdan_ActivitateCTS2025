package Clase;

public class EvaluareSalaMese extends AEvaluare{
    @Override
    void identificareDauna() {
        System.out.println("Identificare daune sala de mese");
    }

    @Override
    void evaluareInitialaDauna() {
        System.out.println("Evaluare initiala daune sala de mese");
    }

    @Override
    void trimitereEvaluareManager() {
        System.out.println("Trimitere evaluare sala de mese catre Manager");
    }
}
