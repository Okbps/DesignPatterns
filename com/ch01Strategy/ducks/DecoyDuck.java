package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.FlyNoWay;
import com.ch01Strategy.behaviors.MuteQuack;

/**
 * Created by Aspire on 15.04.2017.
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("looks like decoy duck");
    }
}
