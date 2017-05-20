package com.ch09Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Aspire on 20.05.2017.
 */
public class Menu extends MenuComponent{
    ArrayList<MenuComponent>list = new ArrayList<MenuComponent>();
    String name, description;

    public Menu(ArrayList<MenuComponent> list) {
        this.list = list;
    }

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(getName() + " - " + getDescription());
        System.out.println("----------------");

        Iterator<MenuComponent>it = list.iterator();
        while(it.hasNext()){
            MenuComponent component = it.next();
            component.print();
        }
    }

    @Override
    public MenuComponent getChild(int i) {
        return list.get(i);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }
}
