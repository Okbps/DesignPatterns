package com.ch03Decorator.decorators;

import com.ch03Decorator.Beverage;
import com.ch03Decorator.CondimentDecorator;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return super.cost() + .10;
    }
}
