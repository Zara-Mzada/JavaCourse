package Lesson9;

public class DiscountedProduct extends Product{
    public int discountPercent;


    public DiscountedProduct(String name, int price, int discountPercent){
        this.discountPercent = discountPercent;
        this.name = name;
        this.price = price;
    }

    public int finalPrice(){
        return price - (price * discountPercent / 100);
    }

    @Override
    public String toString() {
        return "Product name: " + name + ", Price: " + price + ", Discount percent: " + discountPercent;
    }
}
