package com.design.patterns.creational.factorymethod;

import com.design.patterns.creational.factorymethod.basicobjects.Website;

public class Demo {

    /**
     * Doesn't expose instantiation logic
     * Defer instantiation to sub classes
     * Client only knows about the common interface
     * Specified by architecture and implemented by user E.g. Calendar, ResourceBundle, NumberFormat
     * Factory is responsible for lifecycle
     * Multiple concrete classes used by factory itself
     * Parameterized create method
     * Complexity is quite high
     * Creation does not actually take place in the factory but in the subclass of the type of factory method
     * Does not naturally come with refactoring but with upfront design
     *
     * @param args
     */
    public static void main(String[] args) {

        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        Website site2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
        System.out.println(site2.getPages());
    }
}
