package com.design.patterns.behavioral.strategy;

public class Demo {

    /**
     * Eliminate Condition statements
     * Behaviour encapsulated in classes
     * Difficult to add new strategies
     * Client aware of strategies
     * Client chooses strategy
     * E.g. java.util.Comparator
     * Strategy don't know about the next state of system
     * Class per algorithm
     *
     * @param args
     */
    public static void main(String[] args) {
        CreditCard card = new CreditCard(new AmexStrategy());
        card.setNumber("379185883464283");
        card.setDate("04/2020");
        card.setCvv("123");

        System.out.println("Is Amex card valid: " + card.isValid());
    }
}
