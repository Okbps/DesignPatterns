package com.ch08Template;

/**
 * Created by Aspire on 17.05.2017.
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    public abstract void addCondiments();
    public abstract void brew();
    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
    public boolean customerWantsCondiments(){
        return true;
    }
}
