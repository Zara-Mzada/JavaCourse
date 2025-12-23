package Lesson11;

public class Subscription {
    public String userName;
    public double monthlyPrice;

    public Subscription(String userName, double monthlyPrice){
        this.userName = userName;
        this.monthlyPrice = monthlyPrice;
    }

    public void finalPrice(){
        System.out.println("Subscription");
    }
}
