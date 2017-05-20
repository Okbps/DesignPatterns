package com.ch09Iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Aspire on 20.05.2017.
 */
public class CafeMenu implements MenuIterator {
    HashMap<String, MenuItem>items = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        items.put(menuItem.getName(), menuItem);
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return items.values().iterator();
    }
}
