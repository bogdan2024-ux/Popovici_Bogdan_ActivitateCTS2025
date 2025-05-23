package Clase;

import Interfete.IPizza;

public class CrownPizza extends APizzaDecorator {

    public CrownPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public int getPret() {
        return pizza.getPret() + 10;
    }

    @Override
    public String getDetalii() {
        return pizza.getDetalii().substring(0, pizza.getDetalii().length() - Integer.toString(pizza.getPret()).length()) + getPret() + " cu optiunea Crown";
    }
}
