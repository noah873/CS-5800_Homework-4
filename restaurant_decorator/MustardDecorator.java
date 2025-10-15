package restaurant_decorator;

public class MustardDecorator extends FoodItemDecorator{
    public MustardDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getName() {
        return decoratedFoodItem.getName() + " + Mustard";
    }

    @Override
    public double getBasePrice() {
        return decoratedFoodItem.getBasePrice() + 0.50;
    }
}
