package Clase;

public class ValidatorLungime extends Validator{

    @Override
    public void valideaza(String input) {
        if (input.length() < 3) {
            System.out.println("textul este prea scurt");
        } else if (super.getUrmatorulValidator() != null) {
            super.getUrmatorulValidator().valideaza(input);
        }
    }
}
