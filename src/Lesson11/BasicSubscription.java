package Lesson11;

public class BasicSubscription extends Subscription{

    public BasicSubscription(String userName, double monthlyPrice){
        super(userName, monthlyPrice);
    }


    @Override
    public void finalPrice() {
        System.out.println("User name: " + userName + "  Final price: " + monthlyPrice);
    }
}
