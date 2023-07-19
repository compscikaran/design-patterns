package com.design.patterns.creational.factorymethod.basicobjects;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected String pages;

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    public String getPages() {
        return pages;
    }
}
