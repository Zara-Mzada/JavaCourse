import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main (String[] args){
        // ============================ Homework 1 ==============================

//         * 1. Numbers more than 10

//        int[] arr = {4, 11, 25, 3, 8, 19};
//        int[] newArr = new int[3];
//        int index = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > 10){
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr) + " are more than 10");


        // * 2. The number exists inside array

//        int[] a = {2, 4, 9, 15, 7};
//        int target = 15;
//        boolean state = true;
//        for(int i = 0; i < a.length; i++){
//          if(target == a[i]){
//              state = false;
//              System.out.print(a[i] + " exists inside array");
//              break;
//          }
//        }
//        if(state){
//            System.out.print(target + " doesn't exist inside array");
//        }

        // * 3. Find numbers which divide by 3 without remainder

//        int[] arr = {4, 9, 12, 7, 15, 8, 21};
//        int[] newArr = new int[4];
//        int index = 0;
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 3 == 0){
//                newArr[index] = arr[i];
//                index++;
//            }
//        }
//        System.out.print(Arrays.toString(newArr) + " divide by 3 without remainder");

        // ============================ Homework 2 ==============================

        // * 1. Guess the number between 1-100
        Scanner scanner = new Scanner(System.in);

//        int randomNumber = (int)(Math.random() *100) +1;
//        System.out.println(randomNumber);
//
//        int attempts = 0;
//
//        while(true){
//            System.out.print("Guess number: ");
//            int guess = scanner.nextInt();
//            if(randomNumber > guess){
//                System.out.println("It is less, try again");
//                attempts++;
//                continue;
//            }
//            else if(randomNumber < guess){
//                System.out.println("It is more, try again");
//                attempts++;
//                continue;
//            }
//            else{
//                attempts++;
//                System.out.print("Congratulations, you find the number after " + attempts + " !" );
//                break;
//            }
//        }

        // * 2. Check polyndrome word

//        System.out.print("Enter word: ");
//        String word = scanner.next();
//
//        String reversed = "";
//
//        for(int i = word.length() - 1; i >= 0; i-- ){
//            reversed += word.charAt(i);
//        }
//        System.out.println("Reverse version of word: " + reversed);
//
//        if(word.equals(reversed)){
//            System.out.print("Word is polyndrome!");
//        }
//        else{
//            System.out.print("Word is not polyndrome!");
//        }

        // * 3. Get number from user and divide its digits then summarize

//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//
//        int sum = 0;
//
//        while(number > 0){
//            int digit = number % 10;
//            number/=10;
//            sum+=digit;
//        }
//
//        System.out.print("Sum of digits in number: " + sum);

        // * 4. Enter 10 numbers then find min and max

//        int[] arr = new int[10];
//
//        for(int i = 0; i <= arr.length-1; i++){
//            System.out.print("Enter number: ");
//            int num = scanner.nextInt();
//            arr[i] = num;
//        }
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//
//        System.out.print(Arrays.toString(arr) + " " + min + " " + max);

        // * 5. Get number and create pyramid

        //         *
//                ***
//               *****
//              *******
//             *********
//        System.out.print("Enter stage: ");
//        int stage = scanner.nextInt();
//
//        for(int i = 1; i <= stage; i++){
//            for(int j = 1; j <= stage-i; j++){
//                System.out.print(" ");
//            }
//
//            for(int s = 1; s <= 2*i-1; s++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        // ===================================== Homework 3 ==========================================

        int[] cardNums = new int [16];

        for(int i = 0; i<cardNums.length; i++){
            System.out.print("Enter " + (i+1) + " number of card: ");
            int num = scanner.nextInt();
            cardNums[i] = num;
        }


        for(int i = cardNums.length-1; i >= 0; i--){
            int sumOfDigit;

            if(i % 2 == 0){ // eventh nums
                int twice = cardNums[i] * 2; // multiple 2
                if(twice / 10 > 0 && twice / 10 < 9){ // if 2 digit
                    int tens = twice / 10;
                    int ones = twice % 10;
                    sumOfDigit = tens + ones; // then summarize
                    cardNums[i] = sumOfDigit;
                }
                else{
                    cardNums[i] = twice;
                }
            }
        }

        // Checking validation
        int sum = 0;
        for(int i = 0; i < cardNums.length; i++){
            sum+=cardNums[i];
        }

        if(sum % 10 == 0){
            System.out.print("The card is valid!");
        }
        else{
            System.out.print("The card is invalid!");
        }


    }
}
