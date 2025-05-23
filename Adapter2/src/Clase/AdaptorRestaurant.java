package Clase;

import Interfete.IRestaurantA;

public class AdaptorRestaurant extends RestaurantB implements IRestaurantA {

    @Override
    public void analiza(Client client) {
        System.out.print("Adaptam: ");
        super.discount(client.getCostTotal());
    }

}