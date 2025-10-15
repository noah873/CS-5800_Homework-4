package ecommerce_and_restaurants;

public class Main {
    public static void main(String[] args) {
        OnlinePayment onlinePayment1 = new OnlinePayment(new EmailChannel());
        onlinePayment1.makePayment();

        OnlinePayment onlinePayment2 = new OnlinePayment(new SmsChannel());
        onlinePayment2.makePayment();

        CashOnDeliveryPayment cashOnDeliveryPayment1 = new CashOnDeliveryPayment(new EmailChannel());
        cashOnDeliveryPayment1.makePayment();

        CashOnDeliveryPayment cashOnDeliveryPayment2 = new CashOnDeliveryPayment(new SmsChannel());
        cashOnDeliveryPayment2.makePayment();

        BitcoinPayment bitcoinPayment1 = new BitcoinPayment(new EmailChannel());
        bitcoinPayment1.makePayment();

        BitcoinPayment bitcoinPayment2 = new BitcoinPayment(new SmsChannel());
        bitcoinPayment2.makePayment();

        OnlinePayment onlinePayment3 = new OnlinePayment(new PushChannel());
        onlinePayment3.makePayment();

        BitcoinPayment bitcoinPayment3 = new BitcoinPayment(new PushChannel());
        bitcoinPayment3.makePayment();
    }
}
