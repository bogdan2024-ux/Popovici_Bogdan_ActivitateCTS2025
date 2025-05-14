package Clase;

import Interfete.INotificare;

public class NotificarePush implements INotificare {

    @Override
    public void notificare(String notificare) {
        System.out.println("Push " + notificare);
    }

}
