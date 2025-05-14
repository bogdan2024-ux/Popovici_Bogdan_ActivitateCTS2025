package Clase;

public abstract class Validator {

    private Validator urmatorulValidator;

    public Validator getUrmatorulValidator() {
        return urmatorulValidator;
    }

    public void setUrmatorulValidator(Validator urmatorulValidator) {
        this.urmatorulValidator = urmatorulValidator;
    }

    public abstract void valideaza(String input);
}
