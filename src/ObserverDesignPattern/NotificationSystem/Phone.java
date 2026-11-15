package ObserverDesignPattern.NotificationSystem;

public class Phone implements  OrderObserver {
    @Override
    public void notify( Order order) {
        System.out.println(
                "SMS sent to: " + order.getPhoneNumber()
        );

        System.out.println(
                "Your order " + order.getOrderId()
                        + " is delivered"
        );

    }
}
