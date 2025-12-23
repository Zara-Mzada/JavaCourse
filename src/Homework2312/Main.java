package Homework2312;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);

               System.out.print("Enter sentence: ");
               String sentence = sc.nextLine();

               String replacedSentence = sentence.replace(" ", "_");

               String firstFive = "";
               if (replacedSentence.length() >= 5) {
                   firstFive = replacedSentence.substring(0, 5);
               } else {
                   firstFive = replacedSentence;
               }


               String[] words = sentence.split(" ");


               System.out.println("Changed sentence: " + replacedSentence);
               System.out.println("First 5 symbol: " + firstFive);
               System.out.println("Array of words: " + Arrays.toString(words));
   }
}
