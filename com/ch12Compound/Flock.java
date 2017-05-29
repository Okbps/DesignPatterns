package com.ch12Compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aspire on 29.05.2017.
 */
public class Flock implements Quackable{
    List<Quackable>list = new ArrayList<>();

    public void add(Quackable q){
        this.list.add(q);
    }

    @Override
    public void quack() {
        Iterator<Quackable>it = list.iterator();
        while(it.hasNext()){
            Quackable q = it.next();
            q.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
