package com.design.patterns.creational.factorymethod;

import com.design.patterns.creational.factorymethod.basicobjects.BlogWebsite;
import com.design.patterns.creational.factorymethod.basicobjects.ShopWebsite;
import com.design.patterns.creational.factorymethod.basicobjects.Website;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: return new BlogWebsite();
            case SHOP: return new ShopWebsite();
            default: throw new IllegalArgumentException();
        }
    }
}
