package com.ch05Singleton;

/**
 * Created by Aspire on 03.05.2017.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance==null) {
            instance = new Singleton();
        }

        return instance;
    }
}
