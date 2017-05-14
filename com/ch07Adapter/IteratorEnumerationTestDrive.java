package com.ch07Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aspire on 14.05.2017.
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        List<String>list = new ArrayList(Arrays.asList(args));

        IteratorEnumeration ie = new IteratorEnumeration(list.iterator());

        while(ie.hasMoreElements()){
            System.out.println(ie.nextElement());
        }
    }
}
