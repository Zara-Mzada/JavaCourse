package Lesson18;

public class UserNotFound extends RuntimeException {
    public UserNotFound() {

        super("Username or password is invalid");
    }
}
