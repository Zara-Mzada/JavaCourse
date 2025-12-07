package Lesson9;

public class SavingAccount extends Account{
    public int interestRate;


    @Override
    public double monthlyUpdate() {
        balance += balance * interestRate /100;
        return balance;
    }
}
