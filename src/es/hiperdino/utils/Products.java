package es.hiperdino.utils;

import java.util.Random;

public class Products {
    private static final String[] PRODUCT_LIST = new String[]{
            "Clipper Fresa","Mojo de La Palma","Cubanitos","Ambrosías TIRMA","Chorizo de Teror","Appletizer","Munchitos","Papas Chineguas","Almogrote","Gofio","Quesadilla Herreña","Batidos Celgán"
    };

    public static String  getRandom(){
        Random random = new Random();

        return PRODUCT_LIST[random.nextInt(11)];
    }
}
