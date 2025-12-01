package Lesson7;

public class GeneralPointAverage {

    public int gpaCalc(int a, int b, int c){
        int average = (a+b+c)/3;
        gpa(average);
        return average;
    }

    public void gpa(int ave){
        if(ave >= 91){
            System.out.println("A");
        }
        else if(ave >= 81 && ave <= 90){
            System.out.println("B");
        }
        else if(ave >= 71 && ave <= 80){
            System.out.println("C");
        }
        else if(ave >= 61 && ave <= 70){
            System.out.println("D");
        }
        else if(ave >= 51 && ave <= 60){
            System.out.println("E");
        }
        else{
            System.out.println("Failed");
        }
    }

}
