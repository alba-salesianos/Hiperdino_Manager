package es.hiperdino.entities;

import es.hiperdino.utils.RandomGenerator;

import java.util.Stack;

public class Customer {
    public String name;
    private int numberOfItems;
    private Stack<String> shoppingCart = new Stack<>();

    public Customer() {
        this.name = RandomGenerator.getRandomName();
        this.numberOfItems = 0;
    }

    public void addItemToCart(){
        shoppingCart.add(RandomGenerator.getRandomProduct());
        numberOfItems++;
    }

    public String displayCart(){
        String message = shoppingCart.toString().replace("[","").replace("]","").replace(",","\n  -");
        return message = "  - " + message;
    }



    @Override
    public String toString() {
        return "===================================" +
                "\n* Nombre: " + name +
                "\n* Total de productos: " + numberOfItems +
                "\n* Lista de artículos en la cesta:\n" +
                displayCart() +
                "\n ===================================";
    }
}

