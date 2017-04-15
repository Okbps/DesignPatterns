package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.FlyWithWings;
import com.ch01Strategy.behaviors.Quack;

/**
 * Created by Aspire on 15.04.2017.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.printf("looks like mallard duck");
    }
}
