package es.hiperdino;

import es.hiperdino.entities.Cashier;
import es.hiperdino.entities.Customer;
import es.hiperdino.utils.RandomGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cashier placeholderCashier = new Cashier();
        boolean isOpen = false;
        String closedMessage = "La caja está cerrada.";
        int option = -1;
        Scanner keyboard = new Scanner(System.in);


        while (option != 5) {

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n║            H I P E R D I N O            ║";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n║ Seleccione una opción:                  ║ ";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║ 1. Abrir caja                           ║";
            boxGraphic += "\n║ 2. Añadir nuevo cliente a la cola       ║";
            boxGraphic += "\n║ 3. Atender cliente                      ║";
            boxGraphic += "\n║ 4. Ver clientes pendientes              ║";
            boxGraphic += "\n║ 5. Cerrar supermercado                  ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n╚═════════════════════════════════════════╝";

            System.out.println(boxGraphic);
            option = keyboard.nextInt();
            keyboard.nextLine();


            switch (option) {
                case 1:
                    if (!isOpen) {
                        isOpen = true;
                        System.out.println("Caja abierta.");
                    } else {
                        System.out.println("La caja ya está abierta.");
                    }

                    break;


                case 2:

                    if (isOpen) {
                        Customer newCustomer = RandomGenerator.getRandomCustomer();
                        placeholderCashier.addToLine(newCustomer);
                        System.out.println("Cliente añadido:\n" + newCustomer);

                    } else {
                        System.out.println(closedMessage);
                    }

                    break;


                case 3:
                    if (isOpen) {
                        if (!placeholderCashier.isEmpty()) {
                            System.out.println("Siguiente cliente:");
                            System.out.println(placeholderCashier.getNextCustomer());
                        } else {
                            System.out.println("No hay clientes en la cola.");
                        }

                    } else {
                        System.out.println(closedMessage);
                    }

                    break;


                case 4:
                    if (isOpen) {
                        if (!placeholderCashier.isEmpty()) {
                            System.out.println("ID Cajero: " + placeholderCashier.getId()+ "\nMostrando clientes:");
                            System.out.println(placeholderCashier.displayLine());
                        } else {
                            System.out.println("No hay clientes en la cola.");
                        }

                    } else {
                        System.out.println(closedMessage);
                    }

                    break;


                case 5:
                    if (isOpen) {
                        isOpen = false;
                        System.out.println("Caja cerrada.");
                    }
                    System.out.println("Cerrando supermercado...");

                    break;


                default:
                    System.out.println("Opción no válida. Seleccione opción de 1 a 5.");

                    break;
            }
        }
        keyboard.close();
    }
}