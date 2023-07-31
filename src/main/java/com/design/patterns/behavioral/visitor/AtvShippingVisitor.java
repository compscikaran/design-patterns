package com.design.patterns.behavioral.visitor;

import com.design.patterns.behavioral.visitor.elements.*;

import java.util.List;

public class AtvShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel part) {
        System.out.println("Wheels are added");
        shippingAmount += 15;
        System.out.println(shippingAmount);
    }

    @Override
    public void visit(Fender part) {
        System.out.println("Fender is added");
        shippingAmount += 10;
        System.out.println(shippingAmount);
    }

    @Override
    public void visit(Oil part) {
        System.out.println("Oil is added");
        shippingAmount += 5;
        System.out.println(shippingAmount);
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Adding entire order");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size() >= 3) {
            shippingAmount += 10;
        }
        System.out.println(shippingAmount);
    }

}
