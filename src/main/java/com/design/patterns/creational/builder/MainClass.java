package com.design.patterns.creational.builder;

public class MainClass {

    /**
     * Flexibilty over telescoping constructors
     * Static inner class
     * Calls appropriate constructor
     * Negates the need for exposed setters
     *
     *
     */

    public static void main(String[] args) {
        LunchOrder.Builder orderBuilder = new LunchOrder.Builder();
        LunchOrder order = orderBuilder.bread("Multigrain").meat("chicken").dressing("barbeque").build();
        System.out.println(order);
    }
}
