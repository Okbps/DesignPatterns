package com.ch09Iterator;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by Aspire on 20.05.2017.
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[]items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK%2;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position]==null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(
                "Alternating Diner MenuIterator Iterator does not support remove()!"
        );
    }
}
