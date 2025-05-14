import Clase.NotificareEmail;
import Clase.NotificarePush;
import Clase.NotificareSMS;
import Clase.Utilizator;

public class Main {
    public static void main(String[] args) {




        Utilizator u1 = new Utilizator("Andrei", new NotificareSMS());
        u1.notifica("test");
        u1.setNotificare(new NotificareEmail());
        u1.notifica("test2");

        Utilizator u2 = new Utilizator("Ion", new NotificarePush());
        u2.notifica("test3");


    }
}