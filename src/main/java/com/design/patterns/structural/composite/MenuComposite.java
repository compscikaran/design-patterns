package com.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuComposite extends MenuComponent {

    private List<MenuComponent> components = new ArrayList<>();

    public MenuComposite(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> itr = this.components.iterator();
        while(itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }

    @Override
    public MenuComponent add(MenuComponent component) {
        this.components.add(component);
        return component;
    }

    @Override
    public MenuComponent remove(MenuComponent component) {
        this.components.remove(component);
        return component;
    }


}
