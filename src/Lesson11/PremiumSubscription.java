package Lesson11;

public class PremiumSubscription extends Subscription{
    public int extraDevices;

    public PremiumSubscription(String userName,
                               double monthlyPrice,
                               int extraDevices){

        super(userName, monthlyPrice);
        this.extraDevices = extraDevices;
    }

    @Override
    public void finalPrice() {
        System.out.println("User name: " + userName + " Final price: " + (monthlyPrice+(extraDevices*3)));
    }
}
