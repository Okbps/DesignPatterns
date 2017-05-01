package com.ch04Factory;

/**
 * Created by Aspire on 01.05.2017.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }else{
            return null;
        }
    }
}
