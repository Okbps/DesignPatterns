package com.ch02Observer;

/**
 * Created by Aspire on 22.04.2017.
 */
public interface Subject {
    void registerObserver(ObserverLocal o);
    void removeObserver(ObserverLocal o);
    void notifyObservers();

}
