package org.starbuzz.old;

/**
 * Created by ainacio on Nov, 2023
 */
public class Starbuzz {

    public static void main(String[] args) {
        BeverageOld darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        darkRoast.setMocha(true);

        System.out.println(darkRoast.getDescription() + " Cost: " + darkRoast.cost());
    }
}
