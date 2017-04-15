package com.ch01Strategy.behaviors;

/**
 * Created by Aspire on 15.04.2017.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("duck quacking");
    }
}
