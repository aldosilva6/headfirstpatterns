package org.template;

import java.util.AbstractList;

/**
 * Created by ainacio on Nov, 2023
 *
 * {@link AbstractList} is a template method
 */
public class MyStringList extends AbstractList<String> {

    private String[] myStringArray;

    public MyStringList(String[] myStringArray) {
        this.myStringArray = myStringArray;
    }

    @Override
    public String get(int index) {
        return myStringArray[index];
    }

    @Override
    public int size() {
        return myStringArray.length;
    }

    @Override
    public String set(int index, String element) {
        String oldValue = myStringArray[index];
        myStringArray[index] = element;
        return oldValue;
    }
}
