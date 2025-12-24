package Lesson18;

public class WrongNumber extends RuntimeException {
    public WrongNumber() {
        super("The number doesn't match with random number. Try again...");
    }
}
