package com.design.patterns.creational.factory.sample;

import com.design.patterns.creational.factory.Website;

public class ShopWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new SearchPage());
        pages.add(new ContactPage());
    }
}
