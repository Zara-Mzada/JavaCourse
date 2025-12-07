package Lesson9;

public abstract class Account {
    public double balance;

    abstract double monthlyUpdate();

    public void printBalance(){
        System.out.println("Balance: " + balance);
    }
}
