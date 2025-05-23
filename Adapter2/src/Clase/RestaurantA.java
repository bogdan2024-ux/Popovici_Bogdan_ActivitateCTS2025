package Clase;

import Interfete.IRestaurantA;

public class RestaurantA implements IRestaurantA {
    @Override
    public void analiza(Client client) {
        System.out.print("Restaurant A ");
        if(client.costTotal > 100) {
            System.out.println("reducere 10%");
        } else {
            System.out.println("fara reducere");
        }
    }
}
