package Lesson25;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    static int max = 0;
    static int lengthOfWord = 0;
    static String wordMaxLength = "";
    static int sum = 0;
    static int product = 1;

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));
        System.out.println("---------------------------------------------------------------");


        List<String> names = new ArrayList<>(List.of("apple", "banana", "cherry", "ananas"));

//        names.stream().filter(n -> n.substring(0, 1).equals("a")).forEach(System.out::println);
        names.stream().filter(n -> n.startsWith("a")).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
        names.stream().filter(n -> n.endsWith("a")).forEach(System.out::println);

        System.out.println("---------------------------------------------------------------");

        List<Integer> numberArray = new ArrayList<>(List.of(1, 3, 2, 4, 5, 3, 2, 4, 6, 7, 8));
        numberArray.stream().distinct().forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");

//        AtomicInteger max = new AtomicInteger(0);

        numberArray.stream().forEach(
                (n) -> {
                    if (n > max) {
                        max = n;
                    }
                }
        );

        System.out.println(max);


        System.out.println("---------------------------------------------------------------");

        Optional<Integer> max = numberArray.stream().reduce(Integer::sum);
        System.out.println("Max: " + max.get());

        numberArray.forEach(
                n -> {
                    System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
                }
        );
        System.out.println("---------------------------------------------------------------");

        List<Integer> arr2 = new ArrayList<>(List.of(2, 3, 6, 3, 7, 8, 5, 8, 0, 3, 7));

        Map<Integer, Long> midArr = arr2.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(midArr);

        List<Integer> finalArr = midArr
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(finalArr);

        System.out.println("---------------------------------------------------------------");

        List<String> words = new ArrayList<>(List.of("kitab", "defter", "selahiyyetli", "komputer"));
        lengthOfWord = words.getFirst().length();

        words.stream().forEach(
                w -> {
                    if (lengthOfWord < w.length()) {
                        lengthOfWord = w.length();
                        wordMaxLength = w;
                    }
                }
        );
        System.out.println(wordMaxLength);

        System.out.println("---------------------------------------------------------------");
        List<String> text = List.of(
                "Innovation",
                "Knowledge",
                "Creativity",
                "Discipline",
                "Consistency",
                "Motivation",
                "Responsibility",
                "Opportunity",
                "Improvement",
                "Focus",
                "Patience",
                "Strategy",
                "Confidence",
                "Adaptation",
                "Success"
        );

        List<String> list10Words = text.stream().limit(10).toList();
        System.out.println(list10Words);
        System.out.println("---------------------------------------------------------------");


        List<Integer> numArray = new ArrayList<>(List.of(2, 3, 4, 5, 6, 7, 8, 9, 10));

        numArray.stream().map(n -> sum += n).forEach(System.out::println);
        System.out.println(sum);

        numArray.stream().map(n -> product *= n).forEach(System.out::println);
        System.out.println(product);

        System.out.println(numArray.stream().count());
    }
}
