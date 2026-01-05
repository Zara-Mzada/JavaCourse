package Homework0601;

import java.util.HashMap;
import java.util.Map;

public class StudentClass {


    public static void printAllStudents(Map<String, Integer> students) {
        System.out.println(students);
    }

    public static Double findAverageScore(Map<String, Integer> students) {
        int sum = 0;
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            sum += student.getValue();
        }
        double average = sum / students.size();

        return average;
    }

    public static Integer findMaxScore(Map<String, Integer> students) {
        int max = 0;
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            if (student.getValue() > max) {
                max = student.getValue();
            }
        }
        return max;
    }

    public static Map<String, Integer> findLessThan50(Map<String, Integer> students) {
        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            if (student.getValue() < 50) {
                newMap.put(student.getKey(), student.getValue());
            }
        }
        return newMap;
    }

    public static Map.Entry<String, Integer> findScoreByName(Map<String, Integer> students, String name) {

        boolean isExist = false;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            if (student.getKey().equals(name)) {
                isExist = true;
                return student;
            }
        }

        if (!isExist) {
            System.out.println("This student doesn't exist");
        }
        return null;
    }
}
