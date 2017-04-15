package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.FlyNoWay;
import com.ch01Strategy.behaviors.Squeak;

/**
 * Created by Aspire on 15.04.2017.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.printf("looks like rubber duck");
    }
}
