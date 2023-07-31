package com.design.patterns.behavioral.templatemethod;

public class Demo {

    /**
     * Code reuse
     * Force an Algorithm but allow pieces of it to be configurable
     * E.g. Collections.sort(), List.indexOf()
     * Inversion of control
     * Abstract base class is responsible for calling the child class
     * Hooks are put in place may be overridden
     * Operations are put in place that have to be overridden
     * Restrict access to certain methods correctly
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        OrderTemplate order = new F1CarOrder();
        order.processOrder();
    }
}
