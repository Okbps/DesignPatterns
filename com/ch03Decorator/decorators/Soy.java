package com.ch03Decorator.decorators;

import com.ch03Decorator.Beverage;
import com.ch03Decorator.CondimentDecorator;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return super.cost() + .15;
    }
}
