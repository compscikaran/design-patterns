package com.design.patterns.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while(tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken();
            if(test.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
