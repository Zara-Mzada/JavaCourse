package Lesson12;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            this.price = 0;
        }
        else{
            this.price = price;
        }
    }
}
