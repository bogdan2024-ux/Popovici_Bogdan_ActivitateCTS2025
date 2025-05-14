package Clase;

public class ValidatorGol extends Validator {

    @Override
    public void valideaza(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Campul este gol");
        } else if (super.getUrmatorulValidator() != null) {
            super.getUrmatorulValidator().valideaza(input);
        }
    }
}
