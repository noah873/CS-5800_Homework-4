package ecommerce_and_restaurants;

public abstract class Payment {
    protected Notification notification;
    abstract public void makePayment();
}
