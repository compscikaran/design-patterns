package com.design.patterns.behavioral.chainofresponsibility.handlers;

import com.design.patterns.behavioral.chainofresponsibility.Request;
import com.design.patterns.behavioral.chainofresponsibility.RequestType;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
