package com.design.patterns.structural.proxy;

public class Demo {

    /**
     * Acts as an interface to something else by wrapping an object
     * Can add functionality to the object
     * E.g. Security, Simplicity, Remote, Cost
     * E.g. java.lang.reflect.Proxy
     * Only one proxy possible at a time
     * Can add functionality but that is not its main purpose
     * Compile time functionality
     * Decorator's main purpose is to add new functionality
     * Decorator points to its own type
     * Decorator's functionality is determined at runtime
     *
     * @param args
     */
    public static void main(String[] args) {

        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println(service.getTimeline("compscikaran"));
        service.postToTimeline("compscikaran", "Hello this is my first tweet!");
        service.postToTimeline("compscikaran", "Hello this is my second tweet!");
        System.out.println(service.getTimeline("compscikaran"));
        service.postToTimeline("compscikaran", "This is nsfw");
        System.out.println(service.getTimeline("compscikaran"));
    }
}
