package com.ch07Adapter;

/**
 * Created by Aspire on 14.05.2017.
 */
public class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
