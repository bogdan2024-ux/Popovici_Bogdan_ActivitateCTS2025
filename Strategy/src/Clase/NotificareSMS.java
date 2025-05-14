package Clase;

import Interfete.INotificare;

public class NotificareSMS implements INotificare {

    @Override
    public void notificare(String notificare) {
        System.out.println("SMS " + notificare);
    }

}
