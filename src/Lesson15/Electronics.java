package Lesson15;

public class Electronics extends Product{
    private double price;

    public Electronics(double price){
        this.price=price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
