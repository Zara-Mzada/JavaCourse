package Lesson18;

public class BooleanSubClass extends DifferentClasses<Boolean>{

    @Override
    public Boolean task1(String text) {
        if(text.trim().length()>10){
            return true;
        }
        return false;
    }
}
