package Homework0501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");

        String password = sc.next();
        System.out.println(PasswordChecker.checkPassword(password));


    }
}
