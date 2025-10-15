package ecommerce_and_restaurants;

public class OnlinePayment extends Payment{
    public OnlinePayment(Notification notification){
        this.notification = notification;
    }

    @Override
    public void makePayment() {
        notification.sendNotification("Online Payment made and confirmed.");
    }
}
