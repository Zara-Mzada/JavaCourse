package Homework1301;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation: ");

        String operation = sc.nextLine().trim();

        String[] operNew = operation.split(" ");

        for (String s : operNew) {
            System.out.println(s);
        }

        int a = Integer.parseInt(operNew[0]);
        int b = Integer.parseInt(operNew[2]);

        if (operNew[1].equals("+")) {
            System.out.println(operNew[0] + " + " + operNew[2] + " = " + (a + b));
        } else if (operNew[1].equals("-")) {
            System.out.println(operNew[0] + " - " + operNew[2] + " = " + (a - b));
        } else if (operNew[1].equals("*")) {
            System.out.println(operNew[0] + " * " + operNew[2] + " = " + (a * b));
        } else {
            System.out.println(operNew[0] + " / " + operNew[2] + " = " + (a / b));
        }

    }
}
