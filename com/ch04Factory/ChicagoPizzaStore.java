package com.ch04Factory;

import com.ch04Factory.ingridients.PizzaIngredientFactory;
import com.ch04Factory.ingridients.impl.chicago.ChicagoPizzaIngredientFactory;
import com.ch04Factory.ingridients.impl.ny.NYPizzaIngredientFactory;

/**
 * Created by Aspire on 01.05.2017.
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(factory);
        }else if(item.equals("clams")){
            pizza = new ClamPizza(factory);
        }

        return pizza;
    }
}
