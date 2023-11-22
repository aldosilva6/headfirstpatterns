package org.proxy;

/**
 * Created by ainacio on Nov, 2023
 */
public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

    public void refill();
}
