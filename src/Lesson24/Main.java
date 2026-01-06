package Lesson24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        int[][] myArray = {
//                {3, 4, 5, 6},
//                {2, 6, 8},
//                {8, 6, 2, 9}
//        };
//
//        for (int i = 0; i < myArray.length; i++) {
//            for (int j = 0; j < myArray[i].length; j++) {
//                System.out.println(myArray[i][j]);
//            }
//        }
//
//        int[][][] array = {
//                {
//                        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
//                },
//                {
//                        {13, 14, 15, 16}, {17, 18, 19, 20}
//                },
//                {
//                        {21, 22, 23, 24, 25}
//                }
//        };
//
//        System.out.println(array[2][0][3]);


        Map<String, Map<String, Integer>> orders = new HashMap<>();

        orders.put("Zahra", Map.of("Car", 1));
        orders.put("Sevinc", Map.of("House", 2));
        orders.put("Vaqif", Map.of("Clothes", 13));
        orders.put("Sahib", Map.of("Pencil", 23));


//        System.out.println(orders);

        int sumProduct = 0;
        int max = 0;
        String maxOrderUser = "";

        for (Map.Entry<String, Map<String, Integer>> order : orders.entrySet()) {

            for (Map.Entry<String, Integer> product : order.getValue().entrySet()) {
                System.out.println("User: " + order.getKey() + "  -> Product name: " + product.getKey() + "  -> Product count: " + product.getValue());
                sumProduct += product.getValue();
                if (product.getValue() > max) {
                    max = product.getValue();
                    maxOrderUser = order.getKey();
                }
            }
        }

        int averageCount = sumProduct / orders.size();

        System.out.println("Sum of products: " + sumProduct);
        System.out.println("Average count of product: " + averageCount);
        System.out.println("User with high count: " + maxOrderUser + " -> " + max);


        List<String> removeKey = new ArrayList<>();

        for (Map.Entry<String, Map<String, Integer>> order : orders.entrySet()) {
            for (Map.Entry<String, Integer> product : order.getValue().entrySet()) {
                if (product.getValue() < 2) {
                    orders.remove(order.getKey());
//                    removeKey.add(order.getKey());
                }
            }
        }

        for (String key : removeKey) {
            orders.remove(key);
        }

        System.out.println(orders);


    }
}
