package com.design.patterns.structural.composite;

public class MenuLeaf extends MenuComponent {

    public MenuLeaf(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }

    @Override
    public MenuComponent add(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot add items to leaf");
    }

    @Override
    public MenuComponent remove(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot remove items to leaf");
    }
}
