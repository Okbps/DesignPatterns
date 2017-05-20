package com.ch09Iterator;

import java.util.Iterator;

/**
 * Created by Aspire on 19.05.2017.
 */
public class DinerMenuIterator implements Iterator {
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

    @Override
    public void remove() {
        if(position<=0){
            throw new IllegalStateException("You can't remove item until you've done at least one next()");
        };

        if(items[position-1]!=null){
            for(int i=position-1; i<items.length-1; i++){
                items[i]=items[i+1];
            }
            items[items.length-1]=null;
        }
    }
}
