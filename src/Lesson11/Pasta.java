package Lesson11;

public class Pasta extends Meal{
    public String sauceType;

    public Pasta(String name, double basePrice,
                 String sauceType) {
        super(name, basePrice);
        this.sauceType = sauceType;
    }

    @Override
    public double finalPrice() {
        if(sauceType.equals("white")){
           return (basePrice+2);
        }
        else if(sauceType.equals("red")){
           return (basePrice + 1);
        }
        else{
            return basePrice;
        }
    }
}
