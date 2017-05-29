package com.ch12Compound;

/**
 * Created by Aspire on 29.05.2017.
 */
public class QuackCounter implements Quackable{
    static int count = 0;
    Quackable q;

    public QuackCounter(Quackable q) {
        this.q = q;
    }

    @Override
    public void quack() {
        q.quack();
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        q.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        q.notifyObservers();
    }
}
