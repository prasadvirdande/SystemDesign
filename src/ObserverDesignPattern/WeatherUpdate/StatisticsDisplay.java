package ObserverDesignPattern.WeatherUpdate;

public class StatisticsDisplay implements Observer {

    @Override
    public void update(float temperature) {

        System.out.println(
                "Statistics: Temperature updated to " + temperature + "°C"
        );
    }
}