package Lesson7;

public class SumOfDigit {

    public void SumDigit(int num){
        int third = num % 10;

        int second = ((num - third)%100)/10;

        int first = num / 100;
        System.out.println(third+second+first);
    }

    public int SumDigit2(int num){
        int third = num % 10;

        int second = ((num - third)%100)/10;

        int first = num / 100;
        return third+second+first;
    }
}

