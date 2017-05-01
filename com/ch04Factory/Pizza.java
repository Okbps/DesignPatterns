package com.ch04Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aspire on 30.04.2017.
 */
public abstract class Pizza {
    String name, dough, sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppgins:");
        toppings.forEach(System.out::println);
    };
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
