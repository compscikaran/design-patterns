package com.design.patterns.structural.decorator;

public class Demo {

    /**
     * Add behaviour to an existing object
     * Also called a wrapper
     * Single Responsibility principle is followed
     * Compose behaviour dynamically
     * E.g. InputStream, Collections.checkedList
     * Utilizes composition and inheritance
     * Alternative to Subclassing
     * Constructor requires instance from hierarchy
     * New class for every feature
     * Multiple little objects
     * Often confused with simple inheritance
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
