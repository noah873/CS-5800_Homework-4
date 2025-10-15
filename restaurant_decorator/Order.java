package restaurant_decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (FoodItem item : items) {
            totalCost += item.getBasePrice();
        }
        return totalCost;
    }

    public void printOrder() {
        System.out.println("Order:");
        for (FoodItem item : items) {
            System.out.println("\t" + item.getName());
        }
        System.out.println();
    }
}