package Lesson15;

public class Telegram implements Messenger{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Message was sent via Telegram: " + msg);
    }
}
