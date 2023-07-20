package com.design.patterns.structural.bridge;

import com.design.patterns.structural.bridge.with.Blue;
import com.design.patterns.structural.bridge.with.CircleUsingBridge;
import com.design.patterns.structural.bridge.with.SquareUsingBridge;
import com.design.patterns.structural.bridge.without.*;

public class Demo {

    /**
     * Decouple abstraction and implementation similar to Adapter
     * Designed to work with new code
     * Built in advance as designed upfront
     * Changes in abstraction will not affect the client
     * Details won't be right to begin with
     * Flexibility if we are not sure about details
     * E.g. drivers like JDBC
     * Uses composition to decouple the abstraction
     *
     * @param args
     */
    public static void main(String[] args) {

        // without adapter
        Circle circle = new RedCircle();
        circle.applyColor();
        Square square = new RedSquare();
        square.applyColor();

        // with adapter
        Blue blueColor = new Blue();
        CircleUsingBridge circle2 = new CircleUsingBridge(blueColor);
        circle2.applyColor();
        SquareUsingBridge square2 = new SquareUsingBridge(blueColor);
        square2.applyColor();
    }
}
