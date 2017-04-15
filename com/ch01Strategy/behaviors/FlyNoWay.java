package com.ch01Strategy.behaviors;

/**
 * Created by Aspire on 15.04.2017.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("do nothing - can't fly");
    }
}
