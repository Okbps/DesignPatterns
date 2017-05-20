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
}
