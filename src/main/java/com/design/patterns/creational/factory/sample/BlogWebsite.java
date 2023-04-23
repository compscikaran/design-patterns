package com.design.patterns.creational.factory.sample;

import com.design.patterns.creational.factory.Website;

public class BlogWebsite extends Website {

    @Override
    public void createWebsite() {
        pages.add(new ContactPage());
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}
