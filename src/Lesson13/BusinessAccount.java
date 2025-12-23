package Lesson13;

public class BusinessAccount extends BankAccount{
    public BusinessAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        if(amount > 1000){
            System.out.println("Limited amount");
            return getBalance();
        }
        return super.withdraw(amount);
    }
}
