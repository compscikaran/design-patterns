package com.design.patterns.creational.factorymethod.basicobjects;

public class ShopWebsite extends Website {

    @Override
    public void createWebsite() {
        pages = "Welcome to my Shop. See latest products or go to Cart";
    }
}
