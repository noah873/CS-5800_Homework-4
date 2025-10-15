package restaurant_decorator_test;

import restaurant_decorator.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyDiscountTest {
    @Test
    public void testLoyaltyDiscountApply() {
        double totalCost = 10.75;

        Boolean isLoyalty = true;
        double discountedTotalCost = LoyaltyDiscount.apply(totalCost, isLoyalty);

        double expectedTotalCost = 9.68;
        assertEquals(expectedTotalCost, Math.round(discountedTotalCost * 100.0) / 100.0);
    }
}
