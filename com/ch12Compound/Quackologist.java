package com.ch12Compound;

/**
 * Created by Aspire on 29.05.2017.
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Duck "+duck+" just quacked");
    }
}
