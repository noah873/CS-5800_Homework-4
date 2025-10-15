package restaurant_decorator;

public class LoyaltyDiscount {
    public static double apply(double cost, Boolean isLoyalty) {
        if (isLoyalty) {
            return cost * 0.90;
        } else {
            return cost;
        }
    }
}