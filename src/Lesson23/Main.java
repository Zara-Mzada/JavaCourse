package Lesson23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Set<Integer> set1 = new HashSet<>();
//
//        int number = 0;
//        while (number != -1) {
//            System.out.print("Enter number: ");
//            number = sc.nextInt();
//            if (set1.contains(number)) System.out.println("bu eded elave olunub");
//            else set1.add(number);
//
//
//        }
//        System.out.println(set1);


        System.out.print("Enter any sentence: ");
        String sent = sc.next();

        String data = "";

//        List<Character> list = new ArrayList<>();
//
//        for (int i = 0; i < sent.length(); i++) {
//            list.add(sent.charAt(i));
//        }
//
//        for (Character c : list) {
//            if (Character.isUpperCase(c)) {
//                data += c.toString().toLowerCase();
//            } else {
//                data += c.toString().toUpperCase();
//            }
//        }


        for (int i = 0; i < sent.length(); i++) {
            if (Character.isUpperCase(sent.charAt(i))) {
                data += String.valueOf(sent.charAt(i)).toLowerCase();
            } else {
                data += String.valueOf(sent.charAt(i)).toUpperCase();
            }
        }

        System.out.println(data);

    }
}
