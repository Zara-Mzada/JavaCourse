package Lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  ==================================== Student info ============================================

//        Student student = new Student("Zahra", "Malikzada", 2004);
//        System.out.println(student.toString());




// ==================================== Language ================================================

//        System.out.print("Select language: ");

//        String lang = scanner.next();
//
//        if(Language.AZ.name().equals(lang)){
//            System.out.println("Java digər dillərdən WORA prinsipinə görə fərqlənir");
//        }
//        else if(Language.EN.name().equals(lang)){
//            System.out.println("Java differs from other languages due to the WORA principle");
//        }
//        else if(Language.RU.name().equals(lang)){
//            System.out.println("Java отличается от других языков программирования принципом WORA ");
//        }
//        else if(Language.UK.name().equals(lang)){
//            System.out.println("Java відрізняється від інших мов програмування завдяки принципу WORA");
//        }



//  ==================================================== Polyndrome =========================================
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





//  ================================================ Prime number check ===========================================

//        System.out.print("Enter number: ");
//        int num = scanner.nextInt();
//        boolean isPrime = true;
//
//        for(int i = 2; i < num; i++){
//            if(num%i==0){
//                isPrime = false;
//                break;
//            }
//        }
//
//        if(isPrime){
//            System.out.println("Number is prime");
//        }
//        else{
//            System.out.println("Number is not prime");
//        }






//  ========================================== Check some char ===============================================

//        String[] alph = {"ü", "ö", "ğ", "ı", "ə", "ç", "ş", "Ü", "Ö", "Ğ", "I", "Ə", "Ç", "Ş"};
//
//        String word = scanner.next();
//
//        for(int i = 0; i < alph.length; i++){
//            if(word.contains(alph[i])){
//                System.out.println("This type is not correct");
//            }
//        }
//
//        System.out.println("Program finished!");


//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        for(int num : arr){
//            if (num % 2 == 0) {
//                System.out.println(num);
//            }
//        }


//        String[] names = {"Zaur", "Kamila", "Zahra", "Fidan"," Fatima"};
//
//        System.out.print("Enter name: ");
//        String username = scanner.next();
//        boolean isFound = false;
//
//        for(String name : names){
//            if(name.equals(username)){
//                isFound = true;
//            }
//        }
//
//        if(isFound){
//            System.out.println("Name was found");
//        }
//        else{
//            System.out.println("Name was not found");
//        }


//        System.out.print("Enter name, surnam, age:");
//        String info = scanner.nextLine();
//
//        String[] text = info.split(" ");
//
//        String name = text[0];
//        String surname = text[1];
//        String age = text[2];
//
//        System.out.println("Name: " + name + " surname: " + surname + " age: " + age);

//        System.out.println(firstSymbolToUppercase("zaHrA"));

//        String word = "Şəngülüm";
//
//        String newWord = word.replaceAll("Ş", "Sh").
//                replaceAll("ə", "e").
//                replaceAll("ü", "u").toLowerCase();
//
//        System.out.println(newWord);


//        int[] arr = {};
//
//        try{
//            for(int i = 0; i<=arr.length; i++){
//                System.out.println(arr[i]);
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }

//    public static String firstSymbolToUppercase(String name){
//        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
//    }
}
