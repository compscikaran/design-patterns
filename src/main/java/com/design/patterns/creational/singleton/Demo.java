package com.design.patterns.creational.singleton;

public class Demo {

    /**
     * Often overused
     * Difficult to Unit test
     * If not careful then not thread safe
     * Sometimes confused for factory. Singleton returns the same instance always.
     * One constructor no args.
     * No interface
     * Sometimes confused for prototype e.g. Calendar.getInstance() returns a new object every time
     * Easy to implement
     * Solves the well defined problem of only wanting one instance of an object available in application
     *
     * @param args
     */

    public static void main(String[] args) {

        StaticSingleton s1 = StaticSingleton.getInstance();
        StaticSingleton s2 = StaticSingleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));


        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
    }
}
