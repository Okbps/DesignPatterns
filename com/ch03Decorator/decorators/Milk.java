package com.ch03Decorator.decorators;

import com.ch03Decorator.Beverage;
import com.ch03Decorator.CondimentDecorator;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + .10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }


}
