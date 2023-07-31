package com.design.patterns.behavioral.visitor.elements;

import com.design.patterns.behavioral.visitor.AtvPartVisitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}
