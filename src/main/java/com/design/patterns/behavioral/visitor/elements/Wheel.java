package com.design.patterns.behavioral.visitor.elements;

import com.design.patterns.behavioral.visitor.AtvPartVisitor;

public class Wheel implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
