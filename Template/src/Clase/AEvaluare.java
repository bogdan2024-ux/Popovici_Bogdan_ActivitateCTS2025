package Clase;

public abstract class AEvaluare {

    abstract void identificareDauna();

    abstract void evaluareInitialaDauna();

    abstract void trimitereEvaluareManager();

    public final void evaluare() {
        identificareDauna();
        evaluareInitialaDauna();
        trimitereEvaluareManager();
    }

}
