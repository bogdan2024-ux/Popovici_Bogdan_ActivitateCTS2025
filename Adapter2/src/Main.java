import Clase.AdaptorRestaurant;
import Clase.Client;
import Clase.RestaurantA;
import Clase.RestaurantB;
import Interfete.IRestaurantA;
import Interfete.IRestaurantB;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Andrei", 33);
        Client c2 = new Client("Mihai", 53);
        Client c3 = new Client("Rares", 103);

        IRestaurantA ra = new RestaurantA();
        IRestaurantB rb = new RestaurantB();

        ra.analiza(c1);
        ra.analiza(c2);
        ra.analiza(c3);

        rb.discount(30);
        rb.discount(60);
        rb.discount(120);

        IRestaurantA adaptor = new AdaptorRestaurant();
        adaptor.analiza(c1);
        adaptor.analiza(c2);
        adaptor.analiza(c3);

    }
}