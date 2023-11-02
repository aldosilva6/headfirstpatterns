package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public class Whip extends CondimentsDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Adding Whip + " + beverage.getDescription();
    }
}
