package Lesson10;

public class RegularProduct extends Product{

    @Override
    public void getPrice(int price) {
        System.out.println("There is no any discount! " + price);
    }
}
