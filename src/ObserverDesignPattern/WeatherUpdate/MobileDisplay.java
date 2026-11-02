package ObserverDesignPattern.WeatherUpdate;

public class MobileDisplay implements Observer {

    @Override
    public void update(float temperature) {

        System.out.println(
                "Mobile Display: " + temperature + "°C"
        );
    }
}