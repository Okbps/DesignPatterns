package com.ch03Decorator.coffees;

import com.ch03Decorator.Beverage;

/**
 * Created by Aspire on 26.04.2017.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
