package Lesson15;

public class UserService {
    private UserLogger userLogger;

    public UserService(UserLogger userLogger){
        this.userLogger = userLogger;
    }

    public void createUser(User user){
        System.out.println("User created: " + user.getEmail() + " ---> " + user.getPassword());
    }

    public void deleteUser(User user){
        System.out.println("User deleted: " + user.getEmail() + " ---> " + user.getPassword());
    }
//    public Boolean createUser(String email, String password){
//        user.setEmail(email);
//        user.setPassword(password);
//
//        return true;
//    }
//
//
//    public void deleteUser(){
//        System.out.print("User deleted!");
//    }
}
