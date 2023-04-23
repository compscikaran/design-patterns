package com.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Item {

    private String numOfPages;

    @Override
    public String toString() {
        return "Book{" + this.getTitle() + "}";
    }
}
