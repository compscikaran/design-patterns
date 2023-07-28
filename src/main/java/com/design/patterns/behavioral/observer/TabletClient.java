package com.design.patterns.behavioral.observer;

public class TabletClient implements Observer {

    private Subject subject;

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message);
    }


    @Override
    public void update() {
        System.out.println("Tablet stream: " + subject.getState());
    }
}
