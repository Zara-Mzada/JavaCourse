package Homework2601;

public class NameExistsException extends RuntimeException {
    public NameExistsException() {
        System.out.println("This name exists inside list! Try again");
    }
}
