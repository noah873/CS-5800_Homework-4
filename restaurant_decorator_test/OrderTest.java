package restaurant_decorator_test;

import restaurant_decorator.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testGetTotalCost() {
        Order order = new Order();

        FoodItem burger = new OnionsDecorator(new CheeseDecorator(new MustardDecorator(new KetchupDecorator(new Burger()))));
        order.addItem(burger);
        FoodItem fries = new KetchupDecorator(new Fries());
        order.addItem(fries);
        FoodItem hotDog = new HotDog();
        order.addItem(hotDog);

        double expectedTotalCost = 10.75;
        assertEquals(expectedTotalCost, order.getTotalCost());
    }

    @Test
    public void testPrintOrder() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Order order = new Order();

        FoodItem burger = new OnionsDecorator(new CheeseDecorator(new MustardDecorator(new KetchupDecorator(new Burger()))));
        order.addItem(burger);
        FoodItem fries = new KetchupDecorator(new Fries());
        order.addItem(fries);
        FoodItem hotDog = new HotDog();
        order.addItem(hotDog);

        order.printOrder();

        String expectedOutput = "Order:\n\tBurger + Ketchup + Mustard + Cheese + Onions\n\tFries + Ketchup\n\tHot Dog";
        assertEquals(expectedOutput, outputStream.toString().trim());

    }
}
