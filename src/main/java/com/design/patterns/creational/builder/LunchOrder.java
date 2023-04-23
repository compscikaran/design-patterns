package com.design.patterns.creational.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LunchOrder {

    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {}

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.meat = builder.meat;
        this.dressing = builder.dressing;
    }

}
