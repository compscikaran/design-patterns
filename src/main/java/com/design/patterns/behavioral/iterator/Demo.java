package com.design.patterns.behavioral.iterator;

import java.util.Iterator;

public class Demo {

    /**
     * Traverse a container or collection
     * historically loops were used
     * Iterator doesn't expose the underlying structure of the container
     * Navigating various containers may have different algorithms
     * Iterator decouples the client and algorithm used for traversing a container
     * E.g. java.util.Iterator, java.util.Enumeration
     * Independent and fail fast
     * Iterators cannot modify the underlying objects of the container
     * Enumerators are fail safe in contrast
     * Unidirectional traversal usually
     * Speed / Efficiency is less compared to indices
     * 
     *
     * @param args
     */
    public static void main(String[] args) {

        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> itr = repo.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String bike: repo) {
            System.out.println(bike);
        }
    }
}
