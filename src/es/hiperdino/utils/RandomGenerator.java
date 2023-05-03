package es.hiperdino.utils;

import es.hiperdino.entities.Customer;

import java.util.Random;

public class RandomGenerator {

    private static final String[] PRODUCT_LIST = new String[]{
            "Clipper Fresa","Mojo de La Palma","Cubanitos","Ambrosías TIRMA","Chorizo de Teror","Appletizer","Munchitos",
            "Papas Chineguas","Almogrote","Gofio","Quesadilla Herreña","Batidos Celgán"
    };

    private static final String[] NAME_LIST = new String[]{
            "S.Coups","Jeonghan","Joshua","Jun","Wonwoo","Hoshi","Woozi","DK","Minghao","Mingyu","Seungkwan","Vernon","Dino",
            "Mark","Jeno","Jaemin","Haechan","Renjun","Chenle","Jisung"
    };


    public static String getRandomProduct(){
        Random random = new Random();

        return PRODUCT_LIST[random.nextInt(11)];
    }

    public static String getRandomName(){
        Random random = new Random();

        return NAME_LIST[random.nextInt(19)];
    }

    public static Customer getRandomCustomer(){
        Random random = new Random();
        Customer randomCustomer = new Customer();

        for (int i = 0; i < random.nextInt(20); i++) {
            randomCustomer.addItemToCart();
        }

        return randomCustomer;
    }


}
