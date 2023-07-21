package com.design.patterns.behavioral.chainofresponsibility.handlers;

import com.design.patterns.behavioral.chainofresponsibility.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
