package org.iterator.before;

import org.iterator.MenuItem;

import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class WaitressTest {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        waitress.printMenu();
    }



}
