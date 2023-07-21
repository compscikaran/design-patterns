package com.design.patterns.behavioral.chainofresponsibility.handlers;

import com.design.patterns.behavioral.chainofresponsibility.Request;
import com.design.patterns.behavioral.chainofresponsibility.RequestType;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            System.out.println("VP can approve purchases up to 1500 USD");
        } else {
            successor.handleRequest(request);
        }
    }
}
