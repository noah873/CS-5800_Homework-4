package ecommerce_and_restaurants;

public class CashOnDeliveryPayment extends Payment{
    public CashOnDeliveryPayment(Notification notification){
        this.notification = notification;
    }

    @Override
    public void makePayment() {
        notification.sendNotification("Cash on Delivery Payment made and confirmed.");
    }
}
