package SelfStudy;

public class Main {

    public static void main(String[] args) {
        // todo Beginner
//        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        // Print all elements
//        nums.stream().forEach(System.out::println);

        // Odd element
//        nums.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

//        List<String> names = List.of("Ali", "Zara", "John", "Alexandra");

        // Length of word more than 4
//        names.stream().filter(n -> n.length() > 4).forEach(System.out::println);

        // Change word to uppercase
//        names.stream().map(String::toUpperCase).forEach(System.out::println);

        // Count of numbers more than 3
//        System.out.println(nums.stream().filter(n -> n > 3).count());

        // First number more than 3
//        System.out.println(nums.stream().filter(n -> n > 3).findFirst().get());

        // todo Intermediate
//        List<Integer> nums = List.of(2, 3, 4);
        // Square all numbers
//        nums.stream().map(n -> Math.pow(n, 2)).forEach(System.out::println);

//        List<Integer> nums = List.of(1, 2, 2, 3, 3, 4);

        // Print unique values
//        Map<Integer, Long> num = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//
//        List<Integer> finalNums = num.entrySet()
//                .stream()
//                .filter(n -> n.getValue() < 2)
//                .map(Map.Entry::getKey)
//                .toList();
//        System.out.println(finalNums);

        // Sort numbers
//        List<Integer> nums = List.of(4, 7, 2, 8, 9, 5);
//        List<Integer> ascended = nums.stream().sorted().toList();
//        List<Integer> descended = nums.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(ascended);
//        System.out.println(descended);


        // Sum of all number by reduce()
//        System.out.println(nums.stream().reduce(Integer::sum).get());

        // Max and Min
//        System.out.println(nums.stream().max(Comparator.comparing(n -> n)).get());
//        System.out.println(nums.stream().min(Comparator.comparing(n -> n)).get());

        // Even numbers inside new list
//        List<Integer> evenNums = nums.stream().filter(n -> n % 2 == 0).toList();
//        System.out.println(evenNums);

        // todo intermediate -> advanced

//        List<String> names = List.of("Java", "is", "powerful");
//
        // Join words
//        System.out.println(names.stream().collect(Collectors.joining(" ")).toString());

//        List<Integer> nums = List.of(2, 4, 6, 8, 7, 9, -1);
//
        // Select even, odd
//        nums.stream().forEach(n -> {
//            if (n > 0) {
//                if (n % 2 == 0) {
//                    System.out.println(n + " is even");
//                } else {
//                    System.out.println(n + " is odd");
//                }
//            }
//        });


//        List<Integer> nums = List.of(5, 2, 8, 1, 9);

        // Tax largest 2nd number
//        System.out.println(nums.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList()
//                .get(1));


    }
}
