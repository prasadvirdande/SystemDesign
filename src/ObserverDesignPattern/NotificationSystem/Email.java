package ObserverDesignPattern.NotificationSystem;

public class Email implements OrderObserver {
    @Override
    public void notify( Order order) {
        System.out.println("order delivered "+order.getEmail()+ "order id" +order.getOrderId()+ "delivered");
    }
}
