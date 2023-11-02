package org.starbuzz;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}
    boolean milk;
    boolean mocha;

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
