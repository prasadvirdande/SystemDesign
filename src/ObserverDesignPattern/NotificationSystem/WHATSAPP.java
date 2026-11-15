package ObserverDesignPattern.NotificationSystem;

public class WHATSAPP implements OrderObserver {
    @Override
    public void notify( Order order) {
        System.out.println("order delivered " + order.getPhoneNumber()+"order id"+order.getOrderId());
    }
}
