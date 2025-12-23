package Lesson15;

public class Clothing extends Product{
    private double price;

    public Clothing(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
