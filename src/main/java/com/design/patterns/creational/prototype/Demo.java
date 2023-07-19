package com.design.patterns.creational.prototype;

public class Demo {

    /**
     * Avoids costly creation
     * Avoids subclassing
     * Typically don't use the new keyword
     * Instead they are usually cloned
     * Often utilizes an interface and a registry to store the types of objects
     * Its akin to a copy constructor
     * Lightweight construction
     * Shallow or Deep depending on how clone method is implemented
     *
     * @param args
     */
    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setRuntime("3 hours");
        movie.setTitle("Mission Impossible: Dead Reckoning");
        System.out.println(movie);

        Movie movie2 = (Movie) registry.createItem("Movie");
        movie2.setRuntime("3 hours");
        movie2.setTitle("Oppenheimer");
        System.out.println(movie2);

        Book book = (Book) registry.createItem("Book");
        book.setNumberOfPages(300);
        book.setTitle("Dark Matter");
        System.out.println(book);

    }
}
