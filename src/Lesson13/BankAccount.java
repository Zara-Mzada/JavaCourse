package Lesson13;

public class BankAccount {
    private double balance;
    private static int totalAccounts;

    public BankAccount(double balance){
        this.balance = balance;
        totalAccounts++;
    }

    public double deposit(double amount){
        return balance+=amount;
    }

    public double withdraw(double amount){
        return balance-=amount;
    }

    public double getBalance(){
        return balance;
    }

    public static Integer getTotalAccounts(){
        return totalAccounts;
    }
}
