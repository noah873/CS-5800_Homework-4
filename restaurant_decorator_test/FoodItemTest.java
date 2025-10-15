package restaurant_decorator_test;

import restaurant_decorator.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FoodItemTest {
    @Test
    public void testBurgerGetName() {
        Burger burger = new Burger();
        assertEquals("Burger", burger.getName());
    }

    @Test
    public void testBurgerGetBasePrice() {
        Burger burger = new Burger();
        assertEquals(5.0, burger.getBasePrice());
    }

    @Test
    public void testFriesGetName() {
        Fries fries = new Fries();
        assertEquals("Fries", fries.getName());
    }

    @Test
    public void testFriesGetBasePrice() {
        Fries fries = new Fries();
        assertEquals(2.0, fries.getBasePrice());
    }

    @Test
    public void testHotDogGetName() {
        HotDog hotDog = new HotDog();
        assertEquals("Hot Dog", hotDog.getName());
    }

    @Test
    public void testHotDogGetBasePrice() {
        HotDog hotDog = new HotDog();
        assertEquals(1.5, hotDog.getBasePrice());
    }

    @Test
    public void testKetchupDecoratorGetName() {
        KetchupDecorator ketchupDecorator = new KetchupDecorator(new Burger());
        assertEquals("Burger + Ketchup", ketchupDecorator.getName());
    }

    @Test
    public void testKetchupDecoratorGetBasePrice() {
        KetchupDecorator ketchupDecorator = new KetchupDecorator(new Burger());
        assertEquals(5.25, ketchupDecorator.getBasePrice());
    }

    @Test
    public void testCheeseDecoratorGetName() {
        CheeseDecorator cheeseDecorator = new CheeseDecorator(new Burger());
        assertEquals("Burger + Cheese",  cheeseDecorator.getName());
    }

    @Test
    public void testCheeseDecoratorGetBasePrice() {
        CheeseDecorator cheeseDecorator = new CheeseDecorator(new Burger());
        assertEquals(5.5, cheeseDecorator.getBasePrice());
    }

    @Test
    public void testOnionsDecoratorGetName() {
        OnionsDecorator onionsDecorator = new OnionsDecorator(new Burger());
        assertEquals("Burger + Onions", onionsDecorator.getName());
    }

    @Test
    public void testOnionsDecoratorGetBasePrice() {
        OnionsDecorator onionsDecorator = new OnionsDecorator(new Burger());
        assertEquals(5.75,  onionsDecorator.getBasePrice());
    }

    @Test
    public void testMustardDecoratorGetName() {
        MustardDecorator mustardDecorator = new MustardDecorator(new Burger());
        assertEquals("Burger + Mustard", mustardDecorator.getName());
    }

    @Test
    public void testMustardDecoratorGetBasePrice() {
        MustardDecorator mustardDecorator = new MustardDecorator(new Burger());
        assertEquals(5.5,  mustardDecorator.getBasePrice());
    }
}
