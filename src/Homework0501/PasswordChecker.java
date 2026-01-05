package Homework0501;

public class PasswordChecker {
    // length
    // uppercase
    //lowercase
    //number
    //symbol

    public static String checkPassword(String password) {
        int counter = 0;

        if (password.length() >= 8) {
            counter++;
            if (password.matches(".*[A-Z].*")) {
                counter++;
            }
            if (password.matches(".*[a-z].*")) {
                counter++;
            }
            if (password.matches(".*[0-9].*")) {
                counter++;
            }
            if (password.matches(".*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/].*")) {
                counter++;
            }
        }

        if (counter <= 2) {
            return "Weak password";
        } else if (counter <= 4) {
            return "Medium password";
        } else {
            return "Strong password";
        }
    }
}
