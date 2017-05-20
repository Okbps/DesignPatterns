package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class Waitress {
    Menu dMenu;
    Menu phMenu;

    public Waitress(Menu dMenu, Menu phMenu) {
        this.dMenu = dMenu;
        this.phMenu = phMenu;
    }

    public void printMenu(){
        System.out.println("\n===DINER MENU===\n");
        printIterator(dMenu.createIterator());

        System.out.println("\n===PANCAKE MENU===\n");
        printIterator(phMenu.createIterator());
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
