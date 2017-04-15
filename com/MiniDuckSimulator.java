package com;

import com.ch01Strategy.ducks.Duck;
import com.ch01Strategy.ducks.MallardDuck;
import com.ch01Strategy.ducks.ModelDuck;
import com.ch01Strategy.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
