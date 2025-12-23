package Lesson13;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }
}
