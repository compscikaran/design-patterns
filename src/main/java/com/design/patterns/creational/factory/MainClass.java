package com.design.patterns.creational.factory;

import java.util.Arrays;

public class MainClass {

    /**
     * Doesn't expose instantiation logic
     * Defer to subclasses
     * Common interface
     * Specified by architecture, Implemented by user
     * Complexity is high
     * Creation doesn't take place in the factory but in the actual subclasses
     *
     */

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(Arrays.toString(site.getPages().toArray()));
        Website site2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(Arrays.toString(site2.getPages().toArray()));

    }
}
