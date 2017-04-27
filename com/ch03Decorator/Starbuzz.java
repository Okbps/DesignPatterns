package com.ch03Decorator;

import com.ch03Decorator.coffees.DarkRoast;
import com.ch03Decorator.coffees.Espresso;
import com.ch03Decorator.coffees.HouseBlend;
import com.ch03Decorator.decorators.Milk;
import com.ch03Decorator.decorators.Mocha;
import com.ch03Decorator.decorators.Soy;
import com.ch03Decorator.decorators.Whip;

/**
 * Created by Aspire on 26.04.2017.
 */
public class Starbuzz {
    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        System.out.println(String.format("%s: $%.2f", b1.getDescription(), b1.cost()));

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(String.format("%s: $%.2f", b2.getDescription(), b2.cost()));

        Beverage b3 = new HouseBlend();
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(String.format("%s: $%.2f", b3.getDescription(), b3.cost()));
    }
}
