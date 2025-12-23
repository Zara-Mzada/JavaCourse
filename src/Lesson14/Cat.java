package Lesson14;

public class Cat extends Animal{

    public Cat(){
        super.info();
    }


    @Override
    public void sound() {
        System.out.println("I am cat");
    }
}
