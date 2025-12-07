package Lesson10;

public class EmailNotification extends Notification{

    @Override
    public void send(){
        System.out.println("This is a new email");
    }
}
