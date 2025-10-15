package ecommerce_and_restaurants;

public class PushChannel implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push Notification: " + message);
    }
}
