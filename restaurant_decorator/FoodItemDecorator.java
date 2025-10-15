package restaurant_decorator;

public abstract class FoodItemDecorator implements FoodItem {
    protected FoodItem decoratedFoodItem;

    public FoodItemDecorator(FoodItem decoratedFoodItem) {
        this.decoratedFoodItem = decoratedFoodItem;
    }

    @Override
    public String getName() {
        return decoratedFoodItem.getName();
    }

    @Override
    public double getBasePrice() {
        return decoratedFoodItem.getBasePrice();
    }
}
