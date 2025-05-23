package Clase;

import Interfete.IRestaurantB;

public class RestaurantB implements IRestaurantB {

    @Override
    public void discount(int costTotal) {
        System.out.print("Restaurant B ");
        if (costTotal > 100) {
            System.out.println("Reducere 15%");
        } else if (costTotal > 50) {
            System.out.println("Reducere 10%");
        } else {
            System.out.println("Fara reducere");
        }
    }
}
