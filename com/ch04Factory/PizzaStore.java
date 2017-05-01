package com.ch04Factory;

/**
 * Created by Aspire on 30.04.2017.
 */
public abstract class PizzaStore {
    public Pizza orederPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
