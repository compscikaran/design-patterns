package com.design.patterns.behavioral.iterator;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class BikeRepository implements Iterable<String>{

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if(index == bikes.length) {
            String[] largerBikes = new String[bikes.length*2];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = bike;
        index++;
    }


    @NotNull
    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length &&
                        bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}
