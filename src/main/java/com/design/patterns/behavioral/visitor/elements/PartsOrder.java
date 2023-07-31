package com.design.patterns.behavioral.visitor.elements;

import com.design.patterns.behavioral.visitor.AtvPartVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart part) {
        this.parts.add(part);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(this.parts);
    }


    @Override
    public void accept(AtvPartVisitor visitor) {
        for(AtvPart part: this.parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
