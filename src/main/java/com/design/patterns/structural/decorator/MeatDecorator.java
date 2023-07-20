package com.design.patterns.structural.decorator;

public class MeatDecorator extends SandwichDecorator {


    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    private String addMeat() {
        return " chicken";
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }
}
