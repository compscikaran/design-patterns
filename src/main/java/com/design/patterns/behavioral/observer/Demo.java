package com.design.patterns.behavioral.observer;

public class Demo {

    /**
     * Subject doesn't need to know who is observing its changes
     * Unexpected updates
     * Large sized could have performance impact
     * Not knowing what has changed which is caused the update being triggered
     * One to many decoupled pattern
     * Broadcast communication
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Subject subject = new MessageSubject();
        PhoneClient client = new PhoneClient(subject);
        TabletClient client2 = new TabletClient(subject);
        client.addMessage("Hello from Karan");
        client.addMessage("Bye Bye");
    }
}
