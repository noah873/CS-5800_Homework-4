package restaurant_decorator;

public class HotDog implements FoodItem {
    @Override
    public String getName() {
        return "Hot Dog";
    }

    @Override
    public double getBasePrice() {
        return 1.5;
    }
}
