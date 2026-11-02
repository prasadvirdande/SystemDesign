package StrategyDesign.Notification;

public class Notification {

    private SendNotification sendNotification;

    public Notification(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }
    public void sendNotification() {
        sendNotification.sendNotification();
    }
}
