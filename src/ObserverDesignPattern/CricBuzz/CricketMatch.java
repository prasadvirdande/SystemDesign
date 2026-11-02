package ObserverDesignPattern.CricBuzz;

import java.util.ArrayList;
import java.util.List;

public class CricketMatch implements Subject {

    private int runs;
    private int wickets;
    private int over;

    private final List<Observer> observers = new ArrayList<>();

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getOver() {
        return over;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void addRuns(int runs) {
        this.runs += runs;
        notifyObservers();
    }

    public void wicket() {
        this.wickets++;
        notifyObservers();
    }

    public void addOver() {
        this.over++;
        notifyObservers();
    }
}