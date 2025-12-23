package Lesson14;

public class Clothes extends Product{

    public Clothes(String name, double price) {
        super(name, price);
    }

    @Override
    public Double getFinalPrice() {
        return getPrice()*95/100;
    }
}
