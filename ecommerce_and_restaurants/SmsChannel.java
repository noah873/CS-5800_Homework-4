package ecommerce_and_restaurants;

public class SmsChannel implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
