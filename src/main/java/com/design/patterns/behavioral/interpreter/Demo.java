package com.design.patterns.behavioral.interpreter;

import com.thoughtworks.qdox.model.expression.Or;

public class Demo {

    /**
     * Represent Grammar
     * Interpret a sentence
     * Map a domain using a DSL like SQL
     * e.g. java.util.Pattern, java.text.Format
     * Complexity can increase if we need to expand our grammar
     * one class per rule
     * Adding in a new variant
     * Specific target problem
     * Adding new functionality changes every variant
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Expression lions = new TerminalExpression("Lions");
        Expression bears = new TerminalExpression("Bears");
        Expression tigers = new TerminalExpression("Tigers");

        Expression alternation1 = new AndExpression(tigers, bears);
        Expression alternation2 = new OrExpression(lions, alternation1);
        Expression tree = new AndExpression(bears, alternation2);
        System.out.println(tree.interpret("Lions"));
        System.out.println(tree.interpret("Tigers Bears"));
        System.out.println(tree.interpret("Bears"));
        System.out.println(tree.interpret("Lions Tigers Bears"));
    }
}
