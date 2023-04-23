package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.sample.BlogWebsite;
import com.design.patterns.creational.factory.sample.ShopWebsite;
import com.design.patterns.creational.factory.sample.SocialWebsite;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: return new BlogWebsite();
            case SHOP: return new ShopWebsite();
            case SOCIAL: return new SocialWebsite();
            default: return null;
        }
    }
}
