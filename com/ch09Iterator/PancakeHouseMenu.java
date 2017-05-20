package com.ch09Iterator;

import java.util.ArrayList;

/**
 * Created by Aspire on 19.05.2017.
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem>menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegeterian, double price){
        menuItems.add(new MenuItem(name, description, vegeterian, price));
    }

    public Iterator createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
