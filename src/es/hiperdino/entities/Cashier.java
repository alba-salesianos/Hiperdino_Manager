package es.hiperdino.entities;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cashier {
    private int id;
    private int numberOfCustomers;
    private Queue<Customer> customerLine = new LinkedList<>();
    private Queue<String> customerLineNames = new LinkedList<>();

    public Cashier() {
        this.id = new Random().nextInt(99999) + 10000;
        this.numberOfCustomers = 0;
    }

    public int getId() {
        return this.id;
    }

    public void addToLine(Customer customer) {
        customerLine.add(customer);
        customerLineNames.add(customer.getName());
        numberOfCustomers++;
    }


    public String displayLine() {
        return customerLine.toString().replace("[", "").replace("]", "").replace(",", "\n");
    }

    public String displayLineNames() {
        String message = customerLineNames.toString().replace("[", "").replace("]", "").replace(",", "\n  -");
        return message = "  - " + message;
    }

    public boolean isEmpty() {
        if (customerLine.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public Customer getNextCustomer() {
        return customerLine.poll();
    }


    @Override
    public String toString() {
        return "===================================" +
                "\n* ID: " + id +
                "\n* Total de clientes: " + numberOfCustomers +
                "\n* Clientes en la fila:\n" +
                displayLineNames() +
                "\n===================================";
    }
}
