package ObserverDesignPattern.WeatherUpdate;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Observer currentDisplay = new CurrentConditionDisplay();
        Observer statisticsDisplay = new StatisticsDisplay();
        Observer mobileDisplay = new MobileDisplay();

        weatherStation.subscribe(currentDisplay);
        weatherStation.subscribe(statisticsDisplay);
        weatherStation.subscribe(mobileDisplay);

        weatherStation.setTemperature(30);

        weatherStation.setTemperature(35);

        weatherStation.unsubscribe(mobileDisplay);

        weatherStation.setTemperature(40);
    }
}