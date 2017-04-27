package com.ch03Decorator.coffees;

import com.ch03Decorator.Beverage;

/**
 * Created by Aspire on 26.04.2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House Blend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
