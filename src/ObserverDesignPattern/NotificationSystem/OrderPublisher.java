package ObserverDesignPattern.NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class OrderPublisher {

    private List<OrderObserver> observers =
            new ArrayList<>();

    public void subscribe(OrderObserver observer) {

        observers.add(observer);
    }

    public void unsubscribe(OrderObserver observer) {

        observers.remove(observer);
    }

    public void notifyObservers(Order order) {

        for (OrderObserver observer : observers) {

            observer.notify(order);
        }
    }
}