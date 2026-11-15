package ObserverDesignPattern.NotificationSystem;

public class Order {

    private String orderId;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String status;

    public Order(String orderId, String customerName,
                 String email, String phoneNumber) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}