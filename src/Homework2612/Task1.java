package Homework2612;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> array(){
        int count = 10;
        while(count>0){
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            numbers.add(num);
            count--;
        }

        return numbers;
    }

    public void checkOddOrEven(){
        for(Integer number : numbers){
            if(number % 2 == 0){
                System.out.println(number + " is even");
            }
            else{
                System.out.println(number + " is odd");
            }
        }
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.array();
        task.checkOddOrEven();
    }
}
