package Lesson15;

public class Whatsapp implements Messenger{

    @Override
    public void sendMessage(String msg) {
        System.out.println("Message was sent via Whatsapp: " + msg);
    }
}
