package com.design.patterns.creational.factory.sample;

import com.design.patterns.creational.factory.Website;

public class SocialWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new ContactPage());
        pages.add(new SearchPage());
        pages.add(new PostPage());
    }
}
