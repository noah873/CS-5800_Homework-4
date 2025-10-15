package ecommerce_and_restaurants;

public class EmailChannel implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}
