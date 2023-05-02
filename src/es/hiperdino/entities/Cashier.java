package es.hiperdino.entities;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cashier {
    private int id;
    private int numberOfCustomers;
    private Queue<String> customerLine = new LinkedList<>();

    public Cashier() {
        this.id = new Random().nextInt(99999) + 10000;
        this.numberOfCustomers = 0;
    }

    public void addToLine(Customer customer){
        customerLine.add(customer.name);
        numberOfCustomers++;
    }

    public String displayLine(){
        String message = customerLine.toString().replace("[","").replace("]","").replace(",","\n  -");
        return message = "  - " + message;
    }



    @Override
    public String toString() {
        return "===================================" +
                "\n* ID: " + id +
                "\n* Total de clientes: " + numberOfCustomers +
                "\n* Clientes en la fila:\n" +
                displayLine() +
                "\n ===================================";
    }
}
