package Lesson12;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double money){
        return balance += money;
    }

    public double withdraw(double money){
        return balance-=money;
    }
}
