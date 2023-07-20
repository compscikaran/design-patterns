package com.design.patterns.structural.bridge.with;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    abstract public void applyColor();
}
