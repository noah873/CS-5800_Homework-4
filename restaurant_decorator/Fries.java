package restaurant_decorator;

public class Fries implements FoodItem {
    @Override
    public String getName() {
        return "Fries";
    }

    @Override
    public double getBasePrice() {
        return 2.0;
    }
}
