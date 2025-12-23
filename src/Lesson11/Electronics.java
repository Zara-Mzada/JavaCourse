package Lesson11;

public class Electronics extends Product{
    public int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public double finalPrice() {
        if(warranty > 1){
            return super.finalPrice()+ (price *10 /100);
        }
        else{
            return super.finalPrice();
        }
    }
}
