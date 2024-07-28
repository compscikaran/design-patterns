package com.langchain;

import dev.langchain4j.agent.tool.Tool;

public class Calculator {

    @Tool
    public int factorial(int n) {
        System.out.println("I am getting called");
        int result = 1;
        for(int i = 2; i <=n; i++) {
            result *= i;
        }
        return result;
    }

    @Tool
    public double squareRoot(int x) {
        System.out.println("I am getting called 2");
        return Math.sqrt(x);
    }
}
