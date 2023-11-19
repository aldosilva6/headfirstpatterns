package org.iterator.after_cafe;

import org.iterator.MenuItem;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class Waitress {

    List<Menu> menus;
    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }


    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println("Name:" + menuItem.getName() + " - Description: " + menuItem.getDescription() + " - Price: " + menuItem.getPrice());
        }
    }
}
