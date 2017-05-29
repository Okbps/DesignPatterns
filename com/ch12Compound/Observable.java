package com.ch12Compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aspire on 29.05.2017.
 */
public class Observable implements QuackObservable{
    List<Observer>observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer>it = observers.iterator();
        while (it.hasNext()){
            Observer observer = it.next();
            observer.update(duck);
        }
    }
}
