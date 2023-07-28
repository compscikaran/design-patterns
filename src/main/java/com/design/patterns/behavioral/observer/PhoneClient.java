package com.design.patterns.behavioral.observer;

public class PhoneClient implements Observer {

    private Subject subject;

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

   public void addMessage(String message) {
        subject.setState(message);
   }


    @Override
    public void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
