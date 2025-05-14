package Clase;

public class ValidatorCaractere extends Validator {

    @Override
    public void valideaza(String input) {
        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("campul poate contine doar litere");
        } else if (super.getUrmatorulValidator() != null) {
            super.getUrmatorulValidator().valideaza(input);
        }
    }

}
