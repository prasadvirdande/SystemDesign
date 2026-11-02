package StrategyDesign.Payment;

public class Client {

    public static void main(String[] args) {

        Payment payment = new Payment(new UPI());
        payment.pay(100);

        System.out.println("Payment completed");
    }
}
