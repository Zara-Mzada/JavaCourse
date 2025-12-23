package Lesson11;

public class FamilySubscription extends Subscription{
    public int members;

    public FamilySubscription(String userName,
                              double monthlyPrice,
                              int members){
        super(userName, monthlyPrice);
        this.members = members;
    }

    @Override
    public void finalPrice() {
        System.out.println("User name: " + userName + " Final price: " + (monthlyPrice+(members*2)));
    }
}
