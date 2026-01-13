package Lesson29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int countOfOrder;

        Product p1 = new Product("Laptop", 1200.0, 5);
        Product p2 = new Product("Phone", 800.0, 10);
        Product p3 = new Product("Headphones", 150.0, 20);
        Product p4 = new Product("Mouse", 40.0, 12);
        Product p5 = new Product("Keyboard", 90.0, 14);

        List<Product> products = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));

        Customer c1 = new Customer(
                "Ali",
                2500.0,
                Map.of(
                        "Laptop", 1,
                        "Headphones", 2
                )
        );

        Customer c2 = new Customer(
                "Aysel",
                1200.0,
                Map.of(
                        "Phone", 1
                )
        );

        Customer c3 = new Customer(
                "Elvin",
                500.0,
                Map.of(
                        "Mouse", 2,
                        "Keyboard", 1
                )
        );

        Customer c4 = new Customer(
                "Zahra",
                3000.0,
                Map.of(
                        "Laptop", 1,
                        "Phone", 1,
                        "Headphones", 1
                )
        );

        List<Customer> customers = new ArrayList<>(Arrays.asList(c1, c2, c3, c4));

        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String userName = sc.next();

        Customer customer = customers.stream()
                .filter(c -> c.getName().equals(userName))
                .findAny()
                .orElse(null);

        System.out.print("1. Laptop" + "\n" +
                "2. Phone" + "\n" +
                "3. Headphone" + "\n" +
                "4. Mouse" + "\n" +
                "5. Keyboard" + "\n" +
                "What do you want to buy: ");

        String choiceProduct = sc.next();
        if ("1".equals(choiceProduct)) {
            Product product = products.stream()
                    .filter(p -> p.getName().equals("Laptop"))
                    .findAny()
                    .orElse(null);


            System.out.print("How many do you want to buy : ");
            countOfOrder = sc.nextInt();
            if (countOfOrder > 0 && countOfOrder < product.getCount() &&
                    (countOfOrder * product.getPrice()) < customer.getBalance()) {
                System.out.println("Customer: " + customer.getName() + "\n" +
                        "Product: " + product.getName() + "\n" +
                        "Product count: " + countOfOrder + "\n" +
                        "Product price: " + (countOfOrder * product.getPrice()) + "\n" +
                        "Balance: " + (customer.getBalance() - (countOfOrder * product.getPrice())));
            }
        } else if ("2".equals(choiceProduct)) {

        } else if ("3".equals(choiceProduct)) {

        } else if ("4".equals(choiceProduct)) {

        } else if ("5".equals(choiceProduct)) {

        } else {
            System.out.println("There is not this type product!");
        }


//        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 9, 26, 5, 4, 23));
//
//        List<Integer> even = new ArrayList<>();
//        List<Integer> odd = new ArrayList<>();
//
//        Iterator<Integer> it = numbers.iterator();
//
//        while (it.hasNext()) {
//            Integer num = it.next();
//            if (num % 2 == 0) {
//                even.add(num);
//            } else {
//                odd.add(num);
//            }
//        }
//
//        System.out.println(even);
//        System.out.println(odd);
//
//        int max = numbers.get(0);
//        int min = numbers.get(0);
//        int sum = 0;
//
//        while (it.hasNext()) {
//            Integer num = it.next();
//            // Max number
//            if (num > max) {
//                max = num;
//            }
//            // Min  number
//            if (num < min) {
//                min = num;
//            }
//            // Sum
//            sum += num;
//        }
//
//        System.out.println("Max number: " + max);
//        System.out.println("Min number: " + min);
//        System.out.println("Average: " + (sum / numbers.size()));

    }
}
