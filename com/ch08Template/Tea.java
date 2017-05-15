package com.ch08Template;

/**
 * Created by Aspire on 15.05.2017.
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
}
