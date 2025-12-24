package Homework2512;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.print("Enter country: ");
            String country = sc.next();

            CheckArray.checkValue(country);

            System.out.print("Do ypu want to continue (y/n): ");
            String answer = sc.next();

            if("y".equals(answer)){
                continue;
            }
            else{
                break;
            }
        }


    }
}
