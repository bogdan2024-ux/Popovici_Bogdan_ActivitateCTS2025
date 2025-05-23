package Clase;

public class EvaluareToalete extends AEvaluare{
    @Override
    void identificareDauna() {
        System.out.println("Identificare daune toalete");
    }

    @Override
    void evaluareInitialaDauna() {
        System.out.println("Evaluare initiala daune toalete");
    }

    @Override
    void trimitereEvaluareManager() {
        System.out.println("Trimitere evaluare toalete catre manager");
    }
}
