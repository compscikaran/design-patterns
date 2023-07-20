package com.design.patterns.structural.decorator;

public abstract class SandwichDecorator implements Sandwich {

    private Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return this.customSandwich.make();
    }
}
