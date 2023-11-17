package org.iterator.before;

import org.iterator.MenuItem;

import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class Waitress {

    DinerMenu dinerMenu;

    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        for(int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++){
            MenuItem item = pancakeHouseMenu.getMenuItems().get(i);
            System.out.println("Name:" + item.getName() + " - Description: " + item.getDescription() + " - Price: " + item.getPrice());
        }

        for(int i = 0; i < dinerMenu.getMenuItems().length; i++){
            MenuItem item = dinerMenu.getMenuItems()[i];
            System.out.println("Name:" + item.getName() + " - Description: " + item.getDescription() + " - Price: " + item.getPrice());
        }
    }

}
