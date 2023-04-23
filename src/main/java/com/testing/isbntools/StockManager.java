package com.testing.isbntools;

import lombok.Setter;

@Setter
public class StockManager {

    private ExternalISBNDataService webService;

    private ExternalISBNDataService databaseService;

    public String getLocatorCode(String isbn) {
        Book book = databaseService.lookup(isbn);
        if(book == null)
            book = webService.lookup(isbn);
        StringBuilder locator = new StringBuilder();
        locator.append(isbn.substring(isbn.length() - 4));
        locator.append(book.getAuthor().charAt(0));
        locator.append(countWords(book.getTitle()));
        return locator.toString();
    }

    private int countWords(String title) {
        String[] words = title.split(" ");
        return words.length;
    }

}
