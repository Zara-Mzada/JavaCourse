package Lesson17;

public class NotFoundFruitException extends RuntimeException {
    public NotFoundFruitException() {
        super("Fruit doesn't exist");
    }
}
