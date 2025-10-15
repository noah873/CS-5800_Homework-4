package restaurant_decorator;

public class KetchupDecorator extends FoodItemDecorator{
    public KetchupDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getName() {
        return decoratedFoodItem.getName() + " + Ketchup";
    }

    @Override
    public double getBasePrice() {
        return decoratedFoodItem.getBasePrice() + 0.25;
    }
}
