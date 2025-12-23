package Lesson13;

public class PhoneAuth extends Authenticator{

    @Override
    public boolean login(User user) {
        return user.getUsername().matches("\\d+") && user.getUsername().length()==10;
    }
}
