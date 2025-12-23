package Lesson11;

public class Burger extends Meal{
    public boolean extraCheese;

    public Burger(String name,
                  double basePrice,
                  boolean extraCheese){
        super(name, basePrice);
        this.extraCheese = extraCheese;
    }

    @Override
    public double finalPrice() {
        if(extraCheese){
            return basePrice + 2;
        }
        else{
            return basePrice;
        }
    }
}
