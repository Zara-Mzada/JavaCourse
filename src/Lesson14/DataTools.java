package Lesson14;

public final class DataTools {

    public static Integer sum(int num1, int num2){
        return num1 + num2;
    }

    public static Integer average(int num1, int num2){
        return (num1+num2)/2;
    }

    public static Integer maxNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }

    public static Integer minNum(int num1, int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
