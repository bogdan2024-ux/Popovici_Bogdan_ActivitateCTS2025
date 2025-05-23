package Clase;

import Interfete.IPizza;

public abstract class APizzaDecorator implements IPizza {

    protected IPizza pizza;

    public APizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract int getPret();

    @Override
    public abstract String getDetalii();

}
