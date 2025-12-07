package Lesson10;

public class SmsNotification extends Notification{

    @Override
    public void send(){
        System.out.println("There is a new sms!");
    }
}
