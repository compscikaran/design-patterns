package com.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer: this.observerList) {
            observer.update();
        }
    }
}
