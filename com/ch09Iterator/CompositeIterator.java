package com.ch09Iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Aspire on 20.05.2017.
 */
public class CompositeIterator implements Iterator{
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator<MenuComponent>iterator = stack.peek();
            if(iterator.hasNext()){
                return true;
            }else{
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator<MenuComponent>iterator = stack.peek();
            MenuComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        }else{
            return null;
        }
    }
}
