package org.designpattern.duck.impl;

import org.designpattern.duck.FlyBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class FlyRocketPowerd implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm a flying with a rocket");
    }
}
