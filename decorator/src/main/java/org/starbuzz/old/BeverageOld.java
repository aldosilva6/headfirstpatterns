package org.starbuzz.old;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class BeverageOld {

    boolean milk;
    boolean mocha;
    boolean soy;
    boolean whip;
    String description;

    double milkCost = 0.10;
    double soyCost = 0.15;
    double mochaCost = 0.20;
    double whipCost = 0.10;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double cost(){
        double condimentCost = 0.0d;
        if(isMocha()) {
            condimentCost += mochaCost;
        }
        if(isSoy()) {
            condimentCost += soyCost;
        }
        if(isMilk()) {
            condimentCost += milkCost;
        }
        if(isWhip()){
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
