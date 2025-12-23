package Lesson14;

public class Electronics extends Product{

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public Double getFinalPrice() {
        return getPrice() + (getPrice()*10/100);
    }
}
