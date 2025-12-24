package Lesson18;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int randomNumber = rand.nextInt(0, 10);



    public void foundNumber(){
//        System.out.println(randomNumber);
//        boolean isFound = false;
        int[] inputs = new int[99];
        boolean isRepeated = false;
        int index = 0;
        int count = 5;


        while(count>0){
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            for(int i = 0; i<inputs.length; i++){
                if(inputs[i] == num){
                    isRepeated = true;
                }
            }

            if(isRepeated){
                isRepeated = false;
                System.out.println("The number was repeated");
                continue;
            }

            try{
                if(randomNumber != num){
                    count--;
                    inputs[index]=num;
                    index++;
                    throw new WrongNumber();
                }
                else{
                    System.out.println("Winner of the game");
                    break;
                }
            }catch(WrongNumber e){
                System.out.println(e.getMessage() + "heal: " + count);
            }

        }
    }
}
