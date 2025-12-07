package Lesson10;

public class Dog extends Animal{
    public String breed;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void printInfo(){
        System.out.println("Name: " + name + " " +
                " Age: " + age + " " +
                " Breed: " + breed);
    }
}
