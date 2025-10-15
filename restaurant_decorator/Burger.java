package restaurant_decorator;

public class Burger implements FoodItem {
    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public double getBasePrice() {
        return 5.0;
    }
}
