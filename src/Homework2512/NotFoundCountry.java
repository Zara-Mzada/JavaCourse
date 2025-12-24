package Homework2512;

public class NotFoundCountry extends RuntimeException {
    public NotFoundCountry() {
        super("This country doesn't exist inside array");
    }
}
