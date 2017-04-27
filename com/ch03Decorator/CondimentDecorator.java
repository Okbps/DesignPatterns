package com.ch03Decorator;

/**
 * Created by Aspire on 26.04.2017.
 */
public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        super(beverage.getDescription());
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
