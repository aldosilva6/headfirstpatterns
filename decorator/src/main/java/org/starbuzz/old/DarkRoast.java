package org.starbuzz.old;

/**
 * Created by ainacio on Nov, 2023
 */
public class DarkRoast extends BeverageOld {

    public DarkRoast() {
        description = "Most Exellent Dard Roast";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }

}
