package Lesson15;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public boolean process(double amount) {
        System.out.println("Processed $" + amount + " with CreditCard");
        return true;
    }
}
