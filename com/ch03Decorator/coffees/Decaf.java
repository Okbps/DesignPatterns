package com.ch03Decorator.coffees;

import com.ch03Decorator.Beverage;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Decaf extends Beverage{
    public Decaf() {
        super("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
