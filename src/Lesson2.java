import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter first number: ");
//        int a = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int b = scanner.nextInt();
//
//        int sum = a + b;
//        System.out.println("Sum of a and b: " + sum);
//
//        int minution = a - b;
//        System.out.println("Minution a and b: " + minution);
//
//        int multiply = a * b;
//        System.out.println("Multiply a and b: " + multiply);
//
//        double divide = (double) a / b;
//        System.out.println("Divide a and b: " + divide);
//
//        int remainder = a % b;
//        System.out.println("Remainder a and b: " + remainder);





//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//
//        int third = num % 10;
//
//        int second = ((num - third)%100)/10;
//
//        int first = num / 100;
//        System.out.println(first + " " + second + " " + third);
//        int sumOfNum =  first + second + third;
//        System.out.println(sumOfNum);


//        int third = num % 10;
//        int second = (num/10)%10;
//        int first = num/100;
//
//        System.out.println(first + " " + second + " " + third);

// ================= Average of 4 numbers ========================


//        System.out.println("Enter first number: ");
//        int num_1 = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int num_2 = scanner.nextInt();
//        System.out.println("Enter third number: ");
//        int num_3 = scanner.nextInt();
//        System.out.println("Enter fourth number: ");
//        int num_4 = scanner.nextInt();
//
//
//        double average = (double)(num_1+num_2+num_3+num_4)/4;
//        System.out.println(average);

//
//        if(num > 0){
//            System.out.println("The number is +");
//        }
//        else{
//            System.out.println("The number is -");
//        }
//
//
//        if(num % 2 == 0){
//            System.out.println("The number is even");
//        }
//        else{
//            System.out.println("The number is odd");
//        }

//        System.out.print("Enter student's point: ");
//        int point = scanner.nextInt();
//
//        if(point <= 100 && point >= 91) {
//            System.out.println("Student gets A");
//        }
//        else if(point <= 90 && point >= 81){
//            System.out.println("Student gets B");
//        }
//        else if(point <= 80 && point >= 71){
//            System.out.println("Student gets C");
//        }
//        else if(point <= 70 && point >= 61){
//            System.out.println("Student gets D");
//        }
//        else if(point <= 61 && point >= 51){
//            System.out.println("Student gets E");
//        }
//        else{
//            System.out.println("Student failed");
//        }

//       System.out.print("Enter number: ");
//       int num = scanner.nextInt();
//
//       if((num % 3 == 0) && (num % 5 == 0)){
//           System.out.println(num + " can divide both by 3 and by 5 without remain");
//       }
//       else if((num % 3 == 0) && (num % 5 != 0)){
//           System.out.println(num + " can divide only by 3");
//       }
//       else if((num % 3 != 0) && (num % 5 == 0)){
//           System.out.println(num + " can divide only by 5");
//       }
//       else{
//           System.out.println(num + " can divide neither by 3 nor by 5");
//       }

//        System.out.print("Enter num 1: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter num 2: ");
//        int num2 = scanner.nextInt();
//
//        int avg = (num1+num2)/2;
//
//        if(avg > 0){
//            System.out.print("Average is positive");
//        }
//        else if(avg < 0){
//            System.out.print("Average is negative");
//        }
//        else{
//            System.out.print("Average is equal to 0");
//        }


        int[] myArr = {2, 4, 23, 6, 12};


//        int sum = 0;
//        for(int i = 0; i <= myArr.length-1; i++){
//            int num = myArr[i];
//            sum+= num;
//        }
//        System.out.print(sum);

        int max = myArr[0];
        for(int i = 0; i <= myArr.length-1; i++) {

            if(myArr[i] > max) {
                max = myArr[i];
            }
        }
        System.out.print(max);
    }
}
