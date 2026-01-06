package Homework0701;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> moreThan10Even = numbers.stream().filter(n -> n > 10 && n % 2 == 0).toList();

        System.out.println(moreThan10Even);
    }
}
