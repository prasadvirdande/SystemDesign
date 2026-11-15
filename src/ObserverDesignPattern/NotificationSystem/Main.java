package ObserverDesignPattern.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        OrderPublisher publisher = new OrderPublisher();
        publisher.subscribe(new Email());

        publisher.subscribe(new WHATSAPP());

        publisher.subscribe(new Phone());



        Order order = new Order(
                "ORD101",
                "Prasad",
                "prasad@gmail.com",
                "9876543210"
        );

        System.out.println("Order Delivered!");

        publisher.notifyObservers(order);
    }
}


