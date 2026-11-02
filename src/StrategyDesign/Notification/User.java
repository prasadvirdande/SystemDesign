package StrategyDesign.Notification;

public class User {

    public static void main(String[] args) {
        Notification notification = new Notification(new Whatsapp());
        notification.sendNotification();

        notification = new Notification(new Mail());
        notification.sendNotification();

        notification = new Notification(new Popnotification());
        notification.sendNotification();


    }
}
