package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.basicobjects.CreditCard;
import com.design.patterns.creational.abstractfactory.factories.CreditCardFactory;

public class Demo {

    /**
     * Factory of factories
     * Although it can be implemented without using a factory more or less it uses
     * Factory of related objects
     * Common interface
     * Defer instantiation logic to subclasses
     * E.g. DocumentBuilder
     * Group factories together.
     * Factories are still responsible for the lifecycles
     * Usually built using Composition
     * Complexity is very high
     * Runtime switching of what implementation a client receives
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card2);
    }
}
