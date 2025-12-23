package Homework2412;

public class ChangeType {

    public static  <E, R> R changeType(E text){
        if(text instanceof String){
            return (R) Integer.valueOf(((String) text).trim().length());
        }

        if(text instanceof Double){
            return (R) Integer.valueOf(((Double) text).intValue());
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(ChangeType.<String, Integer>changeType("Hello world!"));

        System.out.println(ChangeType.<Double, Integer>changeType(34.67));
    }
}
