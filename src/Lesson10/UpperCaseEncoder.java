package Lesson10;

public class UpperCaseEncoder extends Encoder{

    @Override
    public void encode(String text) {
        System.out.println("All chars must be camel case " + text.toUpperCase());
    }
}
