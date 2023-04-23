package com.design.patterns.creational.factory;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();
}
