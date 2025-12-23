package Homework2412;

public class Task2 <T>{

    public T returnValue(T input){
        return input;
    }

    public static void main(String[] args) {
        Task2<String> text = new Task2<>();
        System.out.println(text.returnValue("Hello world!"));

        Task2<Integer> number = new Task2<>();
        System.out.println(number.returnValue(345));

        Task2<Double> price = new Task2<>();
        System.out.println(price.returnValue(3234.64));

        Task2<Boolean> isTrue = new Task2<>();
        System.out.println(isTrue.returnValue(true));
    }
}
