package org.iterator.after;

import org.iterator.MenuItem;

import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class PancakeHouseMenuIterator implements Iterator{

    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
