package Lesson13;

public class EmailAuth extends Authenticator{
    @Override
    public boolean login(User user) {
        return user.getUsername().contains("@");
    }
}
