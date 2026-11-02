package StrategyDesign.RideFareCalculation;

public class User {
    public static void main(String[] args) {
        Ride ride = new Ride(10, new Car());
        System.out.println("Fare with car : " + ride.calculateFare());

        ride = new Ride(10, new Auto());
        System.out.println("Fare with auto : " + ride.calculateFare());

        ride = new Ride(10, new Bike());
        System.out.println("Fare with bike : " + ride.calculateFare());

        ride = new Ride(10, new PremoumCar());
        System.out.println("Fare with Premium Car : " + ride.calculateFare());
    }
}
