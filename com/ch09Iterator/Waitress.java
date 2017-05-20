package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class Waitress {
    Menu dMenu, phMenu, cMenu;

    public Waitress(Menu dMenu, Menu phMenu, Menu cMenu) {
        this.dMenu = dMenu;
        this.phMenu = phMenu;
        this.cMenu = cMenu;
    }

    public void printMenu(){
        System.out.println("\n===DINER MENU===\n");
        printIterator(dMenu.createIterator());

        System.out.println("\n===PANCAKE MENU===\n");
        printIterator(phMenu.createIterator());

        System.out.println("\n===CAFE MENU===\n");
        printIterator(cMenu.createIterator());
    }

    public void printIterator(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();

            System.out.println(item.getName()
                    +" - "+item.getPrice()
                    +" - "+item.getDescription()
            );
        }
    }
}
