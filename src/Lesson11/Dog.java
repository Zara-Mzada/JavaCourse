package Lesson11;

public class Dog extends Pet{
    public String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public double adoptionFee() {
        if(breed.equals("purebred")){
            return super.adoptionFee() + 20;
        }
        else{
            return super.adoptionFee();
        }
    }
}
