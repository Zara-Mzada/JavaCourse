import java.util.Scanner;

public class Lesson4 {
    public static void main (String[] args){

        // ############################ Class work ##############################
        // 1den n-e qeder

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter count: ");
//        int n = scanner.nextInt();
//        int sum = 0;
        // For loop

//        for(int i = 1; i <= n; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        // While loop

//        int i = 1;
//        while(i <= n){
//           sum+=i;
//           i++;
//        }
//        System.out.print(sum);

        // See each num using while loop



//        while (n > 0) {
//            int digit = n % 10;
//            System.out.println(digit);
//            n = n / 10;
//        }

        // continue, break  ededde tek reqemlerin cemi, cut olsa davam, sondan basa dogru

//        int oddSum = 0;   // 345
//
//        while(n > 0){
//            int digit = n % 10;
//            n = n / 10;
//            if(digit != 0){
//                if(digit % 2 == 0){
//                    continue;
//                }
//                else{
//                    oddSum+=digit; // 5
//                }
//            }
//            else {
//                break;
//            }
//        }
//        System.out.print(oddSum);

        // User enters digit if digit is -1 break, if 0 continue, sum of positive

//        int i = 1;
//        int sumOfPositive = 0;
//
//        while(i <= 4){
//            System.out.print("Enter number: ");
//            int digit = scanner.nextInt();
//            i++;
//
//            if(digit > 0){
//                sumOfPositive+=digit;
//            }
//            else if(digit < 0){
//                break;
//            }
//            else{
//                continue;
//            }
//        }
//        System.out.print(sumOfPositive);

        // 3 number inside array, and with each other

//        int[] arr = {2,3,4};
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length; j++ ){
//                int sum = arr[i] + arr[j];
//                System.out.println( arr[i] +  " + " + arr[j] + " = " + sum);
//            }
//        }

        // positive 4572 tersine cevir ve cemle
//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        int sumOfDigits = 0;
//
//        while(num > 0){
//            int digit = num % 10;
//            System.out.println(digit);
//            sumOfDigits+=digit;
//            num = num / 10;
//        }
//        System.out.print("Sum of digits: " + sumOfDigits);


        // Fibanocci

        // 0,1,1,2,3

//        System.out.print("Enter number: ");
//        int secondNum = scanner.nextInt(); // 1
//
//        System.out.print("Last bound: ");
//        int lastIndex = scanner.nextInt(); //6  first num, next num
// 1,2,3,4,5,6
//
//        int i = 1;
//        int firstNum = 0;
//
//        while(i <= lastIndex){
//          int nextNum = firstNum + secondNum; // 1, 2
//            firstNum = secondNum; // 1
//            secondNum = nextNum;
//          i++;
//          System.out.println(nextNum);
//        }

        // Polyndrome (353 first and last must be same)

//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//
//        int i = 1;
//
//        while(i <= 3){
//            int firstDigit = num / 100;
//            int lastDigit = num % 10;
//            if(i == 3){
//                if(firstDigit == lastDigit){
//                    System.out.print("Number is polyndrome");
//                }
//                else{
//                    System.out.print("Number is not polyndrome");
//                }
//            }
//            i++;
//        }

        // While user write stop write input

//        String stop = "stop";
//        while(true){
//            System.out.print("Enter text: ");
//            String text = scanner.next();
//            if(text.equals(stop)){
//                System.out.print("STOP");
//                break;
//            }
//        }

        // enter nums when sum is 100 or more than 100 stop
//        int sum = 0;
//        while(true){
//            System.out.print("Enter number: ");
//            int input = scanner.nextInt();
//            sum += input;
//            if(sum >= 100){
//                System.out.print("Sum is 100 or more than 100");
//                break;
//            }
//        }
    }
}
