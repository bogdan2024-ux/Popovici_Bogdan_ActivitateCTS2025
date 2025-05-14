import Clase.*;

public class Main {
    public static void main(String[] args) {

        Validator v1 = new ValidatorGol();
        Validator v2 = new ValidatorLungime();
        Validator v3 = new ValidatorCaractere();
        Validator v4 = new ValidatorAcceptat();


        v1.setUrmatorulValidator(v2);
        v2.setUrmatorulValidator(v3);
        v3.setUrmatorulValidator(v4);

        v1.valideaza("   ");
        v1.valideaza("testcorect");
        v1.valideaza("test cu cifre 1");
        v1.valideaza("ts");

    }
}