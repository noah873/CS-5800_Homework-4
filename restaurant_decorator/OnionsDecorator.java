package restaurant_decorator;

public class OnionsDecorator extends FoodItemDecorator{
    public OnionsDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getName() {
        return decoratedFoodItem.getName() + " + Onions";
    }

    @Override
    public double getBasePrice() {
        return decoratedFoodItem.getBasePrice() + 0.75;
    }
}
