package Homework2601;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class User {
    String name;
    int age;
    double salary;

    User(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static List<Map.Entry<Integer, User>> moreThan30(Map<Integer, User> users) {
        return users.entrySet()
                .stream()
                .filter(u -> u.getValue().age > 30)
                .toList();
    }

    public static List<String> moreThan5000(Map<Integer, User> users) {
        return users.entrySet()
                .stream()
                .filter(u -> u.getValue().salary > 5000)
                .map(n -> n.getValue().name)
                .toList();
    }

    public static OptionalDouble averageSalary(Map<Integer, User> users) {
        return users.values()
                .stream()
                .mapToDouble(user -> user.salary)
                .average();
    }

    public static String maxSalaryUser(Map<Integer, User> users) {
        return users.values()
                .stream()
                .max(Comparator.comparing(u -> u.salary))
                .map(m -> m.name)
                .get();
    }

    public static List<User> orderedUsersByAge(Map<Integer, User> users) {
        return users.values()
                .stream()
                .sorted(Comparator.comparing(u -> u.age))
                .toList();
    }

    public static List<String> usersBetweenAge(Map<Integer, User> users) {
        return users.values()
                .stream()
                .filter(u -> u.age > 25 && u.age < 40)
                .map(m -> m.name)
                .toList();
    }

    public static Double sumOfSalaries(Map<Integer, User> users) {
        return users.values()
                .stream()
                .mapToDouble(u -> u.salary)
                .sum();
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Map<Integer, User> userMap = Map.of(
                1, new User("Ali", 28, 4500),
                2, new User("Aysel", 35, 6200),
                3, new User("Murad", 42, 7100),
                4, new User("Leyla", 24, 3800),
                5, new User("Kamal", 31, 5400),
                6, new User("Nigar", 27, 4900),
                7, new User("Orxan", 39, 6800),
                8, new User("Elvin", 22, 3200),
                9, new User("Sabina", 34, 7600),
                10, new User("Rashad", 45, 7500)
        );

        System.out.println("Users more than 30 years: " + User.moreThan30(userMap));
        System.out.println("\n");

        System.out.println("Users more than 5000 salary: " + User.moreThan5000(userMap));
        System.out.println("\n");

        System.out.println("Average salary: " + User.averageSalary(userMap).getAsDouble());
        System.out.println("\n");

        System.out.println("User max salary: " + User.maxSalaryUser(userMap));
        System.out.println("\n");

        System.out.println("Order by age: " + User.orderedUsersByAge(userMap));
        System.out.println("\n");

        System.out.println("Users between 25 and 40 ages: " + User.usersBetweenAge(userMap) + "\n" +
                "Count of users: " + User.usersBetweenAge(userMap).size());
        System.out.println("\n");

        System.out.println("Sum of salaries: " + User.sumOfSalaries(userMap));


    }
}

