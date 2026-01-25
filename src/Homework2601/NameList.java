package Homework2601;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameList {

    static ArrayList<String> names = new ArrayList<>();

    public static void enterNames(String name) {
        if (!checkingExistance(name)) {
            names.add(name);
        }
    }

    public static boolean checkingExistance(String name) {
        try {
            if (!names.contains(name)) {
                return false;
            } else {
                throw new NameExistsException();
            }
        } catch (NameExistsException e) {
            System.out.println(e.getMessage());
            return true;
        }
    }

    public static List<String> getNames() {
        return names;
    }

    public static Integer countOfNames() {
        return names.size();
    }

    public static String theLongestName() {
        int maxLength = 0;
        String maxName = "";
        for (String name : names) {
            if (name.length() > maxLength) {
                maxLength = name.length();
                maxName = name;
            }
        }
        return maxName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while (cont) {
            System.out.print("Enter name: ");
            String nameInput = sc.next();
            NameList.enterNames(nameInput);

            System.out.print("Do you want to continue? (y/n): ");
            String ans = sc.next();

            if ("y".equals(ans)) {
                cont = true;
            } else {
                cont = false;
            }
        }

        System.out.println("List of names: " + NameList.getNames());

        System.out.println("Count of names: " + NameList.countOfNames());

        System.out.println("The longest name: " + NameList.theLongestName());

        System.out.println("Program stopped!");

    }
}


