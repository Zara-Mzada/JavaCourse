package Lesson28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> num = numbers.stream()
                .map(n -> n * 10)
                .filter(n -> n > 300 && n % 2 == 0)
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(num);

        // text-i operation kimi gotur ve hesabla cavabin ver
    }
}
