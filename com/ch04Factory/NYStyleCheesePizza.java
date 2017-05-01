package com.ch04Factory;

/**
 * Created by Aspire on 01.05.2017.
 */
public class NYStyleCheesePizza extends Pizza
{
    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated reggiano cheese");
    }
}
