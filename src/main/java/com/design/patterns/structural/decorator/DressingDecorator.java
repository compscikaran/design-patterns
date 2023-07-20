package com.design.patterns.structural.decorator;

public class DressingDecorator extends SandwichDecorator {


    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make() + addDressing();
    }

    private String addDressing() {
        return " mustard";
    }
}
