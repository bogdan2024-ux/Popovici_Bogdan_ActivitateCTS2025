import Clase.CrownPizza;
import Clase.PizzaQF;
import Clase.PizzaRoma;
import Interfete.IPizza;

public class Main {
    public static void main(String[] args) {

        IPizza cheesePizza = new PizzaQF(50);
        System.out.println(cheesePizza.getDetalii());

        IPizza cheesePizza2 = new CrownPizza(new PizzaQF(50));
        System.out.println(cheesePizza2.getDetalii());

        IPizza romaPizza = new CrownPizza(new PizzaRoma(150));
        System.out.println(romaPizza.getDetalii());




    }
}