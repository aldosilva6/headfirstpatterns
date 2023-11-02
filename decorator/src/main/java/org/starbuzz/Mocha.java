package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public class Mocha extends CondimentsDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Adding Mocha + " + beverage.getDescription();
    }
}
