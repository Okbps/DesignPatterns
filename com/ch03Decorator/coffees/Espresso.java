package com.ch03Decorator.coffees;

import com.ch03Decorator.Beverage;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Espresso extends Beverage{
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
