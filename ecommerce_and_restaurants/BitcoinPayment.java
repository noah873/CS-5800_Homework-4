package ecommerce_and_restaurants;

public class BitcoinPayment extends Payment{
    public BitcoinPayment(Notification notification){
        this.notification = notification;
    }

    @Override
    public void makePayment() {
        notification.sendNotification("Bitcoin Payment made and confirmed.");
    }
}
