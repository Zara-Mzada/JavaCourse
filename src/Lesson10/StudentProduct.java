package Lesson10;

public class StudentProduct extends  Product{

    @Override
    public void getPrice(int price) {
        System.out.println("20% discount for student " + (price*80/100));
    }
}
