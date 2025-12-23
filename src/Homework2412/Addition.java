package Homework2412;

public class Addition <T extends Number> {

    public double addTwoNumber(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Addition<Double> add1 = new Addition();
        System.out.println(add1.addTwoNumber(4.5, 6.2));

        Addition<Integer> add2 = new Addition();
        System.out.println(add2.addTwoNumber(3, 6));
    }
}
