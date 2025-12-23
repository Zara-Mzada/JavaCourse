package Homework2412;

public class NotificationSender<T> {
    public void send(T notification){
        System.out.println("Notification: " + notification);
    }

    public static void main(String[] args) {
        NotificationSender<String> notif1 = new NotificationSender<>();
        notif1.send("Our first notification");

        NotificationSender<Integer> notif2 = new NotificationSender<>();
        notif2.send(6);

        NotificationSender<Boolean> notif3 = new NotificationSender<>();
        notif3.send(false);
    }
}
