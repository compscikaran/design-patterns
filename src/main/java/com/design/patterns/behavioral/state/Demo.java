package com.design.patterns.behavioral.state;

public class Demo {

    /**
     * Localize application state in one object
     * Separate where we are at in the application with what state we have
     * Follows OCP
     * Finite State Machines and application can transition between these states
     * Abstract Class / Interface based
     * E.g. Fan can have finite states - Off, Low, Medium, High
     * Must know all possible states of the application beforehand
     * More classes / boilerplate
     * Keep logic out of context
     * State change triggers cannot always be identified
     * Simplifies Cyclomatic complexity
     *
     * @param args
     */
    public static void main(String[] args) {
        Fan fan = new Fan();
        for (int i = 0; i < 10; i++) {
            fan.pullChain();
        }
    }
}
