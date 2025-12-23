package Lesson12;

public class Singleton {
    private Singleton(){

    }

    public static Singleton getInstance(){
        return new Singleton();
    }

    public void message(){
        System.out.println("Singleton working");
    }


}
