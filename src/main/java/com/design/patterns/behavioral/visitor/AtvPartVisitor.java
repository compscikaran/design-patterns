package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.elements.Fender;
import com.design.patterns.behavioral.visitor.elements.Oil;
import com.design.patterns.behavioral.visitor.elements.PartsOrder;
import com.design.patterns.behavioral.visitor.elements.Wheel;

public interface AtvPartVisitor {
    void visit(Wheel part);
    void visit(Fender part);
    void visit(Oil part);
    void visit(PartsOrder partsOrder);
}
