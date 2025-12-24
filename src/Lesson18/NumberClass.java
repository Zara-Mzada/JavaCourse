package Lesson18;

public class NumberClass <T extends Number>{

    public NumberClass(T number){
        System.out.println(number);
    }

    public static void main(String[] args) {
//        NumberClass<String> num = new NumberClass<>("Hello");

        NumberClass<Integer> num1 = new NumberClass<>(56);
    }
}
