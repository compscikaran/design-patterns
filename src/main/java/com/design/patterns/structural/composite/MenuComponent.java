package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();
    public abstract MenuComponent add(MenuComponent component);
    public abstract MenuComponent remove(MenuComponent component);

    public String print(MenuComponent menuComponent) {
        return menuComponent.getName() + ": " + menuComponent.getUrl() + "\n";
    }
}
