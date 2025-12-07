package Lesson10;

public class UserAuth extends Auth{

    @Override
    public void authentication(String username, String password) {
        System.out.println("You are user");
    }
}
