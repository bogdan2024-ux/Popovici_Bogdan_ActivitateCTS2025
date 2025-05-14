package Clase;

import Interfete.INotificare;

public class NotificareEmail implements INotificare {

    @Override
    public void notificare(String notificare) {
    System.out.println("Email " + notificare);
}


}
