package com.ch12Compound;

/**
 * Created by Aspire on 29.05.2017.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
