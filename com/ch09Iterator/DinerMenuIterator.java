package com.ch09Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class DinerMenuIterator implements Iterator{
    private MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
