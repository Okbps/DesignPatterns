package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class DinerMenu implements MenuIterator {
    static final int MAX_ITMES = 6;
    int numberOfItems = 0;
    MenuItem[]menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITMES];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "A medly of steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name, String description, boolean vegeterian, double price){
        MenuItem item = new MenuItem(name, description, vegeterian, price);

        if(numberOfItems < MAX_ITMES){
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }else{
            System.out.println("Can't add item - the menu is full");
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
