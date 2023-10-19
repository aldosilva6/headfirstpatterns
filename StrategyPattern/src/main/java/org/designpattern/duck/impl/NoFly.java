package org.designpattern.duck.impl;

import org.designpattern.duck.FlyBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
