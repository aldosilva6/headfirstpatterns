package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class CondimentsDecorator extends Beverage {

    Beverage beverage;

    protected CondimentsDecorator() {
    }

    @Override
    public abstract String getDescription();

    protected CondimentsDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize(){
        return beverage.getSize();
    }
}
