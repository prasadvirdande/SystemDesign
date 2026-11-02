package ObserverDesignPattern.WeatherUpdate;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    private float temperature;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {

        this.temperature = temperature;

        System.out.println("\nTemperature changed to " + temperature + "°C");

        notifyObservers();
    }
}