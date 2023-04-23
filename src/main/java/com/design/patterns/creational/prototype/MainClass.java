package com.design.patterns.creational.prototype;

public class MainClass {

    /**
     * Avoids costly creation
     * Avoids subclassing
     * Don't use new
     * Often utilize an interface
     * Usually implemented with a registry where we store original object
     * from which the clones are created
     * Although a copy, each instance is unique
     * Can utilize parameters for construction
     * Shallow vs Deep Copy
     * Not clear when to use
     *
     */

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("My Neighbour Totoro");
        System.out.println(movie);
        Book book = (Book) registry.createItem("Book");
        movie.setTitle("Brief History of time");
        System.out.println(book);

    }
}
