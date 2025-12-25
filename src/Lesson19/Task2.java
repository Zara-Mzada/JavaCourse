package Lesson19;

import java.util.Scanner;

public class Task2 {

    public void typeCast(){
        Scanner sc = new Scanner(System.in);

        int heal = 5;

        while(heal > 0){
            System.out.print("Enter any number: ");
            String word = sc.next();

            try{
                int num = Integer.parseInt(word);
                System.out.println(num);
                break;
            }catch (NumberFormatException e){
                heal--;
                System.out.println(e.getMessage() + " Try chance: " + heal);
            }
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        task.typeCast();
    }
}
