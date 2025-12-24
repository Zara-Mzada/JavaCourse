package Lesson18;

public class User {
    private static String USERNAME;
    private static String PASSWORD ;

    public User(String username,
                String password){
        USERNAME = username;
        PASSWORD = password;
    }


    public Boolean foundUser(String username,
                          String password){
        try{
            if(!User.USERNAME.equals(username) || !User.PASSWORD.equals(password)){
                throw new UserNotFound();
            }
            else{
                System.out.println("Welcome to the website!");
                return true;
            }
        }catch (UserNotFound e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
