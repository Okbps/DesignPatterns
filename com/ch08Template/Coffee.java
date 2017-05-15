package com.ch08Template;

/**
 * Created by Aspire on 15.05.2017.
 */
public class Coffee extends CaffeineBeverage{
    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
