package Lesson11;

public class Pizza extends Meal{
    public String size;

    public Pizza(String name,
                 double basePrice,
                 String size){
        super(name, basePrice);
        this.size = size;
    }

    @Override
    public double finalPrice() {
        if(size.equals("small")){
            return basePrice;
        }
        else if(size.equals("medium")){
            return (basePrice + 3);
        }
        else{
            return (basePrice + 5);
        }

    }
}
