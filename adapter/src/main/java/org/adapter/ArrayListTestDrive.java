package org.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class ArrayListTestDrive {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Aldo");
        listString.add("Emanuela");

        IteratorAdapter iteratorAdapter = new IteratorAdapter(listString.iterator());


        while(iteratorAdapter.hasMoreElements()){
            System.out.println(iteratorAdapter.nextElement());
        }


    }
}
