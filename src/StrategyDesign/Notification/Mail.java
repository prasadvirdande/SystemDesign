package StrategyDesign.Notification;

public class Mail implements SendNotification {
    @Override
    public void sendNotification() {
        System.out.println("Sent notification using Mail");
    }
}
