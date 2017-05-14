package com.ch07Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Aspire on 14.05.2017.
 */
public class EnumerationIterator implements Iterator<Object>{
    Enumeration<?>enumeration;

    public EnumerationIterator(Enumeration<?>enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
