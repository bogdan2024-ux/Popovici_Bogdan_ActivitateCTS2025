package Clase;

import Interfete.INotificare;

public class Utilizator {

    private String nume;
    private INotificare notificare;

    public Utilizator(String nume, INotificare notificare) {
        this.nume = nume;
        this.notificare = notificare;
    }

    public void setNotificare(INotificare notificare) {
        this.notificare = notificare;
    }
    public void notifica(String mesaj) {
        notificare.notificare(mesaj);

    }

}
