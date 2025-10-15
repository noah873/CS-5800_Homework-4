package restaurant_decorator;

public class CheeseDecorator extends FoodItemDecorator{
    public CheeseDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getName() {
        return decoratedFoodItem.getName() + " + Cheese";
    }

    @Override
    public double getBasePrice() {
        return decoratedFoodItem.getBasePrice() + 0.50;
    }
}
