package com.ch04Factory;

/**
 * Created by Aspire on 01.05.2017.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStrore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStrore.orederPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName() + "\n");

        pizza = chicagoStore.orederPizza("cheese");
        System.out.println("Joel ordered  a "+pizza.getName() + "\n");
    }
}
