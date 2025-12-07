package Lesson10;

public class ReverseEncoder extends Encoder{

    @Override
    public void encode(String text) {
        StringBuilder sb = new StringBuilder(text);

        System.out.println("Reverse text " + sb.reverse().toString());
    }
}
