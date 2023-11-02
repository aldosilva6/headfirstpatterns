package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public class Soy extends CondimentsDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost(){
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE){
            cost += .15;
        } else if(beverage.getSize() == Size.VENTI){
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return "Adding Soy + " + beverage.getDescription();
    }
}
