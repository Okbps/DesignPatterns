package com.ch01Strategy.ducks;

import com.ch01Strategy.behaviors.FlyBehavior;
import com.ch01Strategy.behaviors.QuackBehavior;

/**
 * Created by Aspire on 15.04.2017.
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    };

    public void swim(){
        System.out.println("swim");
    };

    public void performFly(){
        flyBehavior.fly();
    };

    public abstract void display();
}
