package Lesson15;

public class MessageSender {

    public static void sendAll(Messenger[] messengers, String msg){
        for(Messenger messenger : messengers){
            messenger.sendMessage(msg);
        }
    }
}
