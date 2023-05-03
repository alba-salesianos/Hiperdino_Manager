package es.hiperdino;

import es.hiperdino.entities.Cashier;
import es.hiperdino.entities.Customer;
import es.hiperdino.utils.RandomGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cashier placeholderCashier = new Cashier();

        boolean isOpen = false;
        int option = -1;
        Scanner keyboard = new Scanner(System.in);



        while (option != 6) {

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
                    if (!isOpen){
                        isOpen = true;
                        System.out.println("Caja abierta.");
                    } else {
                        System.out.println("La caja ya está abierta.");
                    }

                    break;

                case 2:

                    if(isOpen){
                        Customer newCustomer = RandomGenerator.getRandomCustomer();
                        placeholderCashier.addToLine(newCustomer);
                        System.out.println("Cliente añadido:\n" + newCustomer);

                    } else {
                        System.out.println("La caja está cerrada.");
                    }
                    break;

                case 3:

                    break;


                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("¡Maldito seas, Perry el Ornitorrinco!");
                    break;

                default:
                    System.out.println("¡Estás atrapado entre las opciones 1 y 6, Perry el Ornitorrinco! ¡El resto no son válidas!");
                    break;
            }

        }

        keyboard.close();

    }
}