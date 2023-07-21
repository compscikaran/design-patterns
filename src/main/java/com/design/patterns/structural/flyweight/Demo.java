package com.design.patterns.structural.flyweight;

public class Demo {

    /**
     * Optimize memory usage when large number of similar objects present
     * Most of the object states can be extrinsic
     * Heavyweight Immutable objects present in application
     * Pattern of patterns
     * Utilizes a factory
     * Encompasses creation and structure
     * Manages entire lifecycle of objects
     * E.g. String, Integer classes
     * Complex pattern prone to pre-mature optimization because it is designed upfront
     * Not a graphical only pattern
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));

        InventorySystem system = new InventorySystem();
        system.takeOrder("Soap", 1);
        system.takeOrder("Maggi", 2);
        system.takeOrder("Soap", 3);
        system.takeOrder("Maggi", 4);
        system.takeOrder("Fruits", 5);
        system.takeOrder("Maggi", 6);
        system.takeOrder("Fruits", 7);
        system.takeOrder("Soap", 8);

        system.process();
        System.out.println(system.report());
    }
}
