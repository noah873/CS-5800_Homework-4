package ecommerce_and_restaurants_test;

import ecommerce_and_restaurants.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {
    @Test
    public void testOnlinePayment() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        OnlinePayment onlinePayment = new OnlinePayment(new EmailChannel());
        onlinePayment.makePayment();

        String expectedOutput = "Email Notification: Online Payment made and confirmed.";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testCashOnDeliveryPayment() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CashOnDeliveryPayment cashOnDeliveryPayment = new CashOnDeliveryPayment(new SmsChannel());
        cashOnDeliveryPayment.makePayment();

        String expectedOutput = "SMS Notification: Cash on Delivery Payment made and confirmed.";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testBitcoinPayment() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        BitcoinPayment bitcoinPayment = new BitcoinPayment(new PushChannel());
        bitcoinPayment.makePayment();

        String expectedOutput = "Push Notification: Bitcoin Payment made and confirmed.";
        assertEquals(expectedOutput, outputStream.toString().trim());
    }
}
