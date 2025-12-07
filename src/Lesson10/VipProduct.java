package Lesson10;

public class VipProduct extends  Product{

    @Override
    public void getPrice(int price) {
        System.out.println("40% discount " + (price*60/100));
    }
}
