package com.design.patterns.structural.bridge.with;

public class SquareUsingBridge extends Shape {

    public SquareUsingBridge(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.getColor().applyColor();
    }
}
