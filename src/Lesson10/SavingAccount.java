package Lesson10;

public class SavingAccount extends BankAccount{
    public int interestRate;

    public SavingAccount(String owner, int interestRate){
        super(owner);
        this.interestRate = interestRate;
    }

    public void printInfo(){
        System.out.println("Owner: " + owner + " " +
                " Interest rate: " + interestRate);
    }
}
