package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Most Exellent House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
