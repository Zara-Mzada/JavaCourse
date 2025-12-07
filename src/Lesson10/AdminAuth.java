package Lesson10;

public class AdminAuth extends Auth{

    @Override
    public void authentication(String username, String password) {
        System.out.println("You are admin");
    }
}
