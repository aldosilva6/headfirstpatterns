package org.designpattern.impl;

import org.designpattern.FlyBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class FlyRocketPowerd implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm a flying with a rocket");
    }
}
