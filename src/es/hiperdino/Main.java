package es.hiperdino;

import es.hiperdino.entities.Customer;
import es.hiperdino.utils.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println(RandomGenerator.getRandomProduct());
        System.out.println(RandomGenerator.getRandomName());


        Customer cliente1 = new Customer();

        cliente1.addItemToCart();
        cliente1.addItemToCart();
        cliente1.addItemToCart();
        System.out.println(cliente1);


    }
}