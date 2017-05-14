package com.ch07Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Aspire on 14.05.2017.
 */
public class IteratorEnumeration implements Enumeration<Object>{
    Iterator<?>iterator;

    public IteratorEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
