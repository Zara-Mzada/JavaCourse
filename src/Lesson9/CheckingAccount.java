package Lesson9;

public class CheckingAccount extends Account{
    public int monthlyFee;

    @Override
    public double monthlyUpdate() {
        balance -= monthlyFee;
        return balance;
    }
}
