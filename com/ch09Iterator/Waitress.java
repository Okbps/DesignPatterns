package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class Waitress {
    MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu(){
        menu.print();
    }

    public void printVegeterianMenu(){
        Iterator<MenuComponent>iterator = menu.createIterator();
        System.out.println("======VEGETERIAN MENU======");

        while (iterator.hasNext()){
            MenuComponent component = iterator.next();

            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            }catch (UnsupportedOperationException ignored){

            }
        }
    }
}
