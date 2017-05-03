package com.ch04Factory;

import com.ch04Factory.ingridients.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aspire on 30.04.2017.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[]veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Baking for 25 minutes at 350");
    };

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName() {
        return name;
    }
}
