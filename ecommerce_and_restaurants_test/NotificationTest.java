package ecommerce_and_restaurants_test;

import ecommerce_and_restaurants.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NotificationTest {
    @Test
    public void testEmailChannel() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        EmailChannel emailChannel = new EmailChannel();
        emailChannel.sendNotification("Testing Email Notification.");

        String expectedOutput = "Email Notification: Testing Email Notification.";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testSmsChannel() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        SmsChannel smsChannel = new SmsChannel();
        smsChannel.sendNotification("Testing SMS Notification.");

        String expectedOutput = "SMS Notification: Testing SMS Notification.";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

    @Test
    public void testPushChannel() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        PushChannel pushChannel = new PushChannel();
        pushChannel.sendNotification("Testing Push Notification.");

        String expectedOutput = "Push Notification: Testing Push Notification.";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
