package Lesson10;

public class LowerCaseEncoder extends Encoder{

    @Override
    public void encode(String text) {
        System.out.println("All chars must be lower case " + text.toLowerCase());
    }
}
