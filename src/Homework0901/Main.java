package Homework0901;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static Double sum = 0.0;

    public static void main(String[] args) {

        Department it = new Department("IT");
        Department hr = new Department("HR");
        Department finance = new Department("Finance");
        Department marketing = new Department("Marketing");


        Employee ali = new Employee("Ali", 2500.0, it);
        Employee murad = new Employee("Murad", 3000.0, hr);
        Employee leyla = new Employee("Leyla", 280.0, hr);
        Employee aysel = new Employee("Aysel", 800.0, it);
        Employee orxan = new Employee("Orxan", 550.0, finance);
        Employee nigar = new Employee("Nigar", 4800.0, finance);
        Employee elvin = new Employee("Elvin", 350.0, marketing);
        Employee zahra = new Employee("Zahra", 6000.0, it);


        Map<Department, Map<Employee, Double>> employees = new HashMap<>();

        employees.put(it, new HashMap<>(Map.of(
                ali, ali.getSalary(),
                aysel, aysel.getSalary(),
                zahra, zahra.getSalary()
        )));

        employees.put(hr, new HashMap<>(Map.of(
                murad, murad.getSalary(),
                leyla, leyla.getSalary()
        )));

        employees.put(finance, new HashMap<>(Map.of(
                orxan, orxan.getSalary(),
                nigar, nigar.getSalary()
        )));

        employees.put(marketing, new HashMap<>(Map.of(
                elvin, elvin.getSalary()
        )));


        // todo Each department's employees
        List<Map<Employee, Double>> itEmployees = new ArrayList<>();
        List<Map<Employee, Double>> hrEmployees = new ArrayList<>();
        List<Map<Employee, Double>> financeEmployees = new ArrayList<>();
        List<Map<Employee, Double>> marketingEmployees = new ArrayList<>();


//        List<Map<Employee, Double>> itEmployees1 = employees.entrySet()
//                .stream()
//                .filter(n -> n.getKey().equals(it))
//                .map(Map.Entry::getValue)
//                .toList();
//
//        System.out.println(itEmployees1);

        employees.entrySet()
                .stream()
                .forEach(n -> {
                    if (n.getKey().equals(it)) {
                        itEmployees.add(n.getValue());
                    } else if (n.getKey().equals(hr)) {
                        hrEmployees.add(n.getValue());
                    } else if (n.getKey().equals(finance)) {
                        financeEmployees.add(n.getValue());
                    } else {
                        marketingEmployees.add(n.getValue());
                    }
                });


        System.out.println("IT employees: " + itEmployees);
        System.out.println("HR employees: " + hrEmployees);
        System.out.println("Finance employees: " + financeEmployees);
        System.out.println("Marketing employees: " + marketingEmployees);

        // todo Each department's employees salary sum
        // IT total salary
        itEmployees.stream()
                .forEach(n ->
                        n.entrySet().stream()
                                .map(Map.Entry::getValue)
                                .forEach(a -> sum += a));
        System.out.println("Total salary of IT department: " + sum);

        // HR total salary
        Double totalSalaryOfHR = hrEmployees.stream()
                .flatMap(n -> n.values().stream())
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total salary of HR department: " + totalSalaryOfHR);

        // Finance total salary
        Double totalSalaryOfFinance = financeEmployees.stream()
                .flatMap(n -> n.values().stream())
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total salary of finance department: " + totalSalaryOfFinance);

        // Marketing
        Double totalSalaryOfMarketing = marketingEmployees.stream()
                .flatMap(n -> n.values().stream())
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total salary of marketing department: " + totalSalaryOfMarketing);

        // todo Remove less than 1000 salary

        employees.values().forEach(n -> n.entrySet()
                .removeIf(entry -> entry.getValue() < 1000));

        System.out.println("After removing less than 1000 salaries" + employees);

        // todo How many human in each country?

        List<Human> humans = new ArrayList<>(List.of(
                new Human("Ali", Country.AZERBAIJAN),
                new Human("Leyla", Country.AZERBAIJAN),
                new Human("Ramin", Country.AZERBAIJAN),
                new Human("Nigar", Country.AZERBAIJAN),

                new Human("Elena", Country.RUSSIA),
                new Human("Ivan", Country.RUSSIA),
                new Human("Dmitry", Country.RUSSIA),

                new Human("John", Country.USA),
                new Human("Michael", Country.USA),
                new Human("Sophia", Country.USA),

                new Human("Marco", Country.ITALY),
                new Human("Luca", Country.ITALY),

                new Human("Ahmet", Country.TURKEY),
                new Human("Leyla", Country.TURKEY),
                new Human("Mehmet", Country.TURKEY),
                new Human("Fatma", Country.TURKEY),

                new Human("William", Country.ENGLAND),
                new Human("Olivia", Country.ENGLAND)
        ));

        System.out.println(humans.stream().collect(Collectors.groupingBy(Human::getCountry, Collectors.counting())));

    }
}
