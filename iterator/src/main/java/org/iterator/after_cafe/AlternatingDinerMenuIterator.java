package org.iterator.after_cafe;

import org.iterator.MenuItem;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by ainacio on Nov, 2023
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position = position + 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
