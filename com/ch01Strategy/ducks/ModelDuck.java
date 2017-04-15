package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.FlyNoWay;
import com.ch01Strategy.behaviors.Quack;

/**
 * Created by Aspire on 15.04.2017.
 */
public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("model duck");
    }

    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }
}
