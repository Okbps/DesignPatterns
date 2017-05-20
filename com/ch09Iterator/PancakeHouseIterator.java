package com.ch09Iterator;

import java.util.ArrayList;

/**
 * Created by Aspire on 19.05.2017.
 */
public class PancakeHouseIterator implements MyIterator {
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size() || items.get(position)==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
