package Homework0601;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // todo ------------- Task 1 ----------------

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Camal", 84);
        students.put("Zahra", 100);
        students.put("Ali", 44);
        students.put("Fidan", 49);
        students.put("Sabir", 79);

        // All students and their scores

        StudentClass.printAllStudents(students);
        System.out.println("#########################################################################");


        // Average score

        System.out.println(StudentClass.findAverageScore(students));
        System.out.println("#########################################################################");

        // Max score

        System.out.println(StudentClass.findMaxScore(students));
        System.out.println("#########################################################################");

        // Less than 50

        System.out.println(StudentClass.findLessThan50(students));
        System.out.println("#########################################################################");

        // Find score by name
        System.out.println(StudentClass.findScoreByName(students, "Fidan"));
        System.out.println(StudentClass.findScoreByName(students, "Humbat"));
        System.out.println("#########################################################################");


        // todo ----------- Task 2 -------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week day by number: ");
        int num = sc.nextInt();

        WeekDay.findDayByNumber(num);


        // todo ----------- Task 3 -------------
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operation: ");
        String operation = sc.next();

        System.out.println(CalculatorBySwitch.calculation(num1, num2, operation));
    }
}
