package StrategyDesign.Notification;

public class Whatsapp implements SendNotification {
    @Override
    public void sendNotification() {
        System.out.println("Sent notification using Whatsapp");
    }
}
