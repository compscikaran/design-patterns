package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setPrice(100.0);
        movie.setTitle("Ponyo");
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setPrice(100.0);
        book.setTitle("The Making of a Manager");
        book.setNumOfPages("379");
        items.put("Book", book);
    }

}
