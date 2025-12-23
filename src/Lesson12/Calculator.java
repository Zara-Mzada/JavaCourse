package Lesson12;

public class Calculator {
    private int doubleNumber(int n){
        return n*2;
    }

    public int tripleNumber(int n){
        System.out.println(doubleNumber(n));
        return n*3;
    }

}
