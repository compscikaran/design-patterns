package com.design.patterns.behavioral.chainofresponsibility;

import com.design.patterns.behavioral.chainofresponsibility.handlers.CEO;
import com.design.patterns.behavioral.chainofresponsibility.handlers.Director;
import com.design.patterns.behavioral.chainofresponsibility.handlers.Handler;
import com.design.patterns.behavioral.chainofresponsibility.handlers.VP;

import java.util.Arrays;
import java.util.List;

public class Demo {

    /**
     * Decoupling of sender and receiver of request
     * Receiver contains reference to next receiver
     * Promotes loose coupling
     * Ok to have no handlers also
     * Each handler is based on a common interface and is represented by a concrete implementation
     * Its not guaranteed whether somewhere along the way someone will handle the request
     * Runtime configuration risk
     * Chain length can cause performance issues
     * No history is stored and undo functionality is not available
     * E.g. Servlet doFilter, Spring Security Filter chain
     *
     * @param args
     */
    public static void main(String[] args) {
        Handler workflow = buildWorkflow();
        Request req1 = new Request(RequestType.CONFERENCE, 500);
        Request req2 = new Request(RequestType.PURCHASE, 1000);
        Request req3 = new Request(RequestType.PURCHASE, 2000);
        workflow.handleRequest(req1);
        workflow.handleRequest(req2);
        workflow.handleRequest(req3);
    }

    public static Handler buildWorkflow() {
        List<Handler> approvers = Arrays.asList(new Director(), new VP(), new CEO());
        for (int i = 0; i < approvers.size() -1 ; i++) {
            Handler approver = approvers.get(i);
            Handler successor = approvers.get(i+1);
            approver.setSuccessor(successor);
        }
        return approvers.get(0);
    }
}
