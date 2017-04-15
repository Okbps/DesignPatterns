package com.ch01Strategy.behaviors;

/**
 * Created by Aspire on 15.04.2017.
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("do nothing - can't quack");
    }
}
