package Lesson14;

public class Dog extends Animal{

    public Dog(){
        super.info();
    }

    @Override
    public void sound() {
        System.out.println("I am dog");
    }
}
