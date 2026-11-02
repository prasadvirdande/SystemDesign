package ObserverDesignPattern.WeatherUpdate;

public class CurrentConditionDisplay implements Observer {

    @Override
    public void update(float temperature) {

        System.out.println(
                "Current Conditions: " + temperature + "°C"
        );
    }
}
