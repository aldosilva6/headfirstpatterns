package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public class Milk extends CondimentsDecorator{
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Adding Milk + " + beverage.getDescription();
    }
}
