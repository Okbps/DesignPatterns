package com.ch08Template;

/**
 * Created by Aspire on 15.05.2017.
 */
abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    public abstract void addCondiments();
    public abstract void brew();
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
