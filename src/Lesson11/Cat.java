package Lesson11;

public class Cat extends Pet{
    public String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public double adoptionFee() {
        if(color.equals("white")){
            return super.adoptionFee()+10;
        }
        else{
            return super.adoptionFee();
        }
    }
}
