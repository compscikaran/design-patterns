package com.design.patterns.structural.bridge.with;

public class CircleUsingBridge extends Shape {

    public CircleUsingBridge(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.getColor().applyColor();
    }
}
