package com.design.patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends Item{

    private String runtime;

    @Override
    public String toString() {
        return "Movie{" + this.getTitle() + "}";
    }
}
