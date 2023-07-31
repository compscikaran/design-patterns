package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.elements.Fender;
import com.design.patterns.behavioral.visitor.elements.Oil;
import com.design.patterns.behavioral.visitor.elements.PartsOrder;
import com.design.patterns.behavioral.visitor.elements.Wheel;

public class Demo {

    /**
     *  Separate Algorithm from an object structure
     *  Adding new features but cannot modify the existing object structure
     *  Maintain Open / Closed principle
     *  E.g. java.lang.model.element.ElementVisitor
     *  Interface based
     *  Hard to retrofit, has to be designed upfront
     *  Each element has a visit method and Visitor knows about all the elements
     *  Indirection of working with an object outside its domain
     *  Each concrete visitor may not have implementation for visiting all elements
     *
     * @param args
     */
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        order.accept(new AtvShippingVisitor());
    }
}
