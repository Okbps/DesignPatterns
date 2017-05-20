package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 20.05.2017.
 */
public abstract class MenuComponent {
    Iterator<MenuComponent>it = null;

    public abstract Iterator<MenuComponent>createIterator();

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }
}
