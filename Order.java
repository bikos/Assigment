//Write a function to calculate the gross profit of an order
package com.epromos;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public double getGrossProfit() {
        double gross = 0.0;
        for (Item item : items) {
            gross += item.profit();
        }
        return gross;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Shampoo", 12, 4));
        order.addItem(new Item("Oil", 11, 3));
        System.out.println("Gross Profit: " + order.getGrossProfit());
    }
}

class Item {

    private String productName;
    private double netPrice;
    private double deduction;

    public Item(String productName, double netPrice, double deduction) {
        this.productName = productName;
        this.netPrice = netPrice;
        this.deduction = deduction;
    }

    public double profit() {
        return this.netPrice - this.deduction;
    }
}
