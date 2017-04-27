package com.ch03Decorator;

/**
 * Created by Aspire on 26.04.2017.
 */
public abstract class Beverage {
    private final String description;
    public enum Size{TALL, GRANDE, VENTI};

    public String getDescription() {
        return description;
    }

    public Beverage(String description) {
        this.description = description;
    }

    public abstract double cost();

}
