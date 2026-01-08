package Lesson26;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static int count = 0;
    static double sum = 0;

    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Ali", 85);
        studentScores.put("Aysel", 92);
        studentScores.put("Murad", 76);
        studentScores.put("Nigar", 88);
        studentScores.put("Elvin", 64);
        studentScores.put("Leyla", 45);
        studentScores.put("Kamran", 71);
        studentScores.put("Amina", 83);
        studentScores.put("Rashad", 59);
        studentScores.put("Sabina", 40);

//
//        studentScores.entrySet().stream()
//                .filter(n -> n.getValue() > 80)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);

//        studentScores.entrySet()
//                .stream()
//                .filter(n -> n.getValue() < 50)
//                .forEach(n -> {
//                    count++;
//                    System.out.println(n.getKey() + " failed");
//                })
//        ;
//        System.out.println("All failed students: " + count);


//        List<String> failedStudents = studentScores.entrySet()
//                .stream()
//                .filter(n -> n.getValue() < 50)
//                .map(Map.Entry::getKey)
//                .toList();
//
//        for (String e : failedStudents) {
//            studentScores.remove(e);
//        }
//
//        System.out.println(studentScores);


        Map<String, Double> employeeSalaries = new HashMap<>();

        employeeSalaries.put("Ali", 3500.0);
        employeeSalaries.put("Aysel", 4200.0);
        employeeSalaries.put("Murad", 3100.0);
        employeeSalaries.put("Nigar", 500.0);
        employeeSalaries.put("Elvin", 2800.0);
        employeeSalaries.put("Leyla", 610.0);
        employeeSalaries.put("Kamran", 3900.0);
        employeeSalaries.put("Amina", 4500.0);
        employeeSalaries.put("Rashad", 260.0);
        employeeSalaries.put("Sabina", 4700.0);

//        employeeSalaries.entrySet()
//                .stream()
//                .filter(n -> n.getValue() > 1000)
//                .forEach(System.out::println);


//        employeeSalaries.entrySet()
//                .stream()
//                .forEach(n -> {
//                    sum += n.getValue();
//                });
//
//        System.out.println("Average salary: " + sum / employeeSalaries.size());

        employeeSalaries.entrySet()
                .stream()
                .filter(n -> n.getValue() > 1000)
                .map(Map.Entry::getKey)
                .toList().forEach(
                        employeeSalaries::remove
                );

        System.out.println(employeeSalaries);


    }
}
