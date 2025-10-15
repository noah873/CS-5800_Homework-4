package restaurant_decorator;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        FoodItem burger = new OnionsDecorator(new CheeseDecorator(new MustardDecorator(new KetchupDecorator(new Burger()))));
        order.addItem(burger);
        FoodItem fries = new KetchupDecorator(new Fries());
        order.addItem(fries);
        FoodItem hotDog = new HotDog();
        order.addItem(hotDog);
        order.printOrder();

        System.out.printf("Order's Total Cost: $%.2f\n", order.getTotalCost());

        Boolean isLoyalty = true;
        double discountedTotalCost = LoyaltyDiscount.apply(order.getTotalCost(), isLoyalty);
        System.out.printf("Order's Total Cost with Loyalty Discount: $%.2f", discountedTotalCost);
        System.out.println();
    }
}
