package restaurant_decorator_test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import restaurant_decorator.FoodItem;

@Suite
@SelectClasses({FoodItemTest.class, OrderTest.class, LoyaltyDiscountTest.class})
public class CompleteUnitTest {}
