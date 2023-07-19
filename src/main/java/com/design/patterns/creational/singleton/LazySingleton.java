package com.design.patterns.creational.singleton;

public class LazySingleton {

    private static class LazyHolder {
        static final LazySingleton INSTANCE = new LazySingleton();
    }

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
