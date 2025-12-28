package Homework2912;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistCalculator {

    public static Integer calcSum(ArrayList<Integer> nums){
        int sum = 0;
        for(Integer n : nums){
            sum+=n;
        }
        return sum;
    }

    public static Integer calcMultiplication(ArrayList<Integer> nums){
        int mult = 1;
        for(Integer n : nums){
            mult*=n;
        }
        return mult;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>(Arrays.asList(4,7,2,7,4,8,9,3));

        System.out.println("Sum: " + ArraylistCalculator.calcSum(numArray) + "  Multiplication: " + ArraylistCalculator.calcMultiplication(numArray));
    }
}
