package com.design.patterns.behavioral.chainofresponsibility.handlers;

import com.design.patterns.behavioral.chainofresponsibility.Request;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything");
    }
}
