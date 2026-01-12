package Lesson27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Ali", 25, 234.4);
        Human h2 = new Human("Zara", 21, 637.7);
        Human h3 = new Human("Murad", 21, 234.8);
        Human h4 = new Human("Aysel", 18, 374.3);
        Human h5 = new Human("Kamran", 40, 248.7);

        List<Human> humanList = new ArrayList<>();
        humanList.add(h1);
        humanList.add(h2);
        humanList.add(h3);
        humanList.add(h4);
        humanList.add(h5);

//        Collections.sort(humanList);
//        System.out.println(humanList);


//        humanList.sort(Comparator.comparingInt(Human::getAge));
//        System.out.println(humanList);
//
//        humanList.sort(Comparator.comparingDouble(Human::getBalance));
//        System.out.println(humanList);
//
//        humanList.sort(Comparator.comparing(Human::getAge)
//                .thenComparing(Human::getBalance));
//        System.out.println(humanList);

//        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 4, 67, 9));
//        List<Integer> l2 = new ArrayList<>(Arrays.asList(6, 8, 3, 6, 8, 9, 3));
//        List<Integer> lastList = List.of(l1, l2).stream().flatMap(n -> n.stream())
//                .filter(a -> a % 2 == 0).distinct().toList();


//        Integer countOfList = Math.toIntExact(List.of(l1, l2).stream().flatMap(n -> n.stream())
//                .count());

//        long countOfList1 = List.of(l1, l2).stream().flatMap(n -> n.stream())
//                .count();
//
//        Optional<Integer> maxNum = List.of(l1, l2).stream()
//                .flatMap(List::stream)
//                .max(Comparator.comparing(Integer::intValue));
//
//        System.out.println(maxNum);
//
//        System.out.println(countOfList1);


//        lastList.stream().flatMap(n -> n.stream()).forEach(a -> {
//            System.out.println(a % 2 == 0 ? a + " is even" : a + " is odd");
//        });

//        System.out.println(lastList);


        List<String> w1 = new ArrayList<>(Arrays.asList("quantity", "quality", "good"));
        List<String> w2 = new ArrayList<>(Arrays.asList("yesterday", "today", "tomorrow", "day after day"));

        long countOfList = List.of(w1, w2).stream()
                .flatMap(n -> n.stream())
                .count();

        System.out.println(countOfList);

        int lengthOfList = List.of(w1, w2).stream()
                .flatMap(List::stream)
                .collect(Collectors.joining())
                .length();

        System.out.println(lengthOfList);

        List.of(w1, w2).stream()
                .flatMap(n -> n.stream())
                .filter(n -> n.length() > 5)
                .map(Main::firstCharUpper)
                .forEach(System.out::println);
    }


    public static String firstCharUpper(String word) {
        return word.substring(0, 1).toUpperCase().concat(word.substring(1));
    }
}
