package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "pineapple", "banana", "strawberry", "cherry", "apple", "cherry", "apple"));
    Scanner sc = new Scanner(System.in);

    public Integer checkFruit(){
        System.out.print("Enter fruit: ");
        String inputFruit = sc.next();
        int count = 0;

        for(String f : fruits){
            if(f.equals(inputFruit)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println("There are " + task.checkFruit() + " fruit");
    }
}
