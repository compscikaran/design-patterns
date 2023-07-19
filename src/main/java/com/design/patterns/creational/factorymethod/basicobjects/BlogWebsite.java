package com.design.patterns.creational.factorymethod.basicobjects;

public class BlogWebsite extends Website {

    @Override
    public void createWebsite() {
        pages = "Welcome to blog website. See latest posts";
    }
}
