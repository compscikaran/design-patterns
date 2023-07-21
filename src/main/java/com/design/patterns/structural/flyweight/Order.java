package com.design.patterns.structural.flyweight;

public class Order {

    private final int orderNumber;
    private final Item item;

    public Order(int orderNumber, Item item) {
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Item getItem() {
        return item;
    }

    public void process() {
        System.out.println("Ordering " + item + " for order number: " + orderNumber);
    }
}
