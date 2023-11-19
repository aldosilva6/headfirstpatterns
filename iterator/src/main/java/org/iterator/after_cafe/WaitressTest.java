package org.iterator.after_cafe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class WaitressTest {

    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        DinerMenu dinerMenu = new DinerMenu();
        menus.add(dinerMenu);
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        menus.add(pancakeHouseMenu);
        CafeMenu cafeMenu = new CafeMenu();
        menus.add(cafeMenu);
        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }

}
