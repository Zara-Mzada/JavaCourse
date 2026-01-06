package Homework0701;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // todo Task 1
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> moreThan10Even = numbers.stream().filter(n -> n > 10 && n % 2 == 0).toList();

        System.out.println(moreThan10Even);


        // todo Task 2
        Test t = (name) -> name.length();

        System.out.println(t.sayHi("Hello world!"));


        // todo Task 3
        List<String> names = new ArrayList<>(List.of("Chimnaz", "Sahib", "Gulmammad", "Ilkin", "Lala", "Nuray", "Zulfiyya", "Zahra", "Hikmat"));
        List<String> newList = names.stream().filter(n -> n.length() > 5).map(n -> n.toUpperCase()).toList();

        System.out.println(newList);


        // todo Task 5

        List<Employee> employees = new ArrayList<>(List.of(new Employee("Chimnaz", 2678),
                new Employee("Sahib", 2800),
                new Employee("Gulmammad", 3400),
                new Employee("Ilkin", 2600),
                new Employee("Lala", 3800),
                new Employee("Nuray", 4500),
                new Employee("Zulfiyya", 5000),
                new Employee("Hikmat", 5000),
                new Employee("Zahra", 6000)));


        employees.stream()
                .filter(e -> e.getSalary() > 3000)
                .sorted(Comparator.comparing(e -> e.getSalary()))
                .map(Employee::getName)
                .forEach(name -> System.out.println(name));

    }
}
