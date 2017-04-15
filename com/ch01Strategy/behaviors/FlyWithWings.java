package com.ch01Strategy.behaviors;

/**
 * Created by Aspire on 15.04.2017.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("duck flying");
    }
}
