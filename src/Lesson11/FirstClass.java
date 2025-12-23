package Lesson11;

public class FirstClass {

//    public String name;

    private void first(){
        System.out.println("I am private method");
    }

    public String callFirst(){
        first();
        return "salam";
    }
}
