package Lesson18;

public class IntegerSubClass extends DifferentClasses<Integer>{
    @Override
    public Integer task1(String text) {
        return text.trim().length();
    }
}
