package Lesson11;

public class Pet {
    public String name;
    public int age;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public double adoptionFee(){
        return 50;
    }
}
