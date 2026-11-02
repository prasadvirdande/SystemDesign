package StrategyDesign.Notification;

public class Popnotification implements SendNotification{
    @Override
    public void sendNotification() {
        System.out.println("Sent notification using Pop");
    }
}
