package ecommerce_and_restaurants_test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({PaymentTest.class, NotificationTest.class})
public class CompleteUnitTest {}
