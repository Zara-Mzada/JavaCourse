package Lesson11;

public class Meal {
    public String name;
    public double basePrice;

    public Meal(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }


    public double finalPrice(){
        System.out.println("Meal's final price");
        return 1;
    }
}
