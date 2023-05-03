package es.hiperdino;

import es.hiperdino.entities.Cashier;
import es.hiperdino.entities.Customer;
import es.hiperdino.utils.RandomGenerator;

public class Tests {
    public static void main(String[] args) {
        System.out.println(RandomGenerator.getRandomProduct());
        System.out.println(RandomGenerator.getRandomName());


        Customer cliente1 = new Customer();

        cliente1.addItemToCart();
        cliente1.addItemToCart();
        cliente1.addItemToCart();
        System.out.println(cliente1);

        Cashier cashier1 = new Cashier();
        cashier1.addToLine(cliente1);

        System.out.println(cashier1);

        System.out.println(RandomGenerator.getRandomCustomer());



    }
}
