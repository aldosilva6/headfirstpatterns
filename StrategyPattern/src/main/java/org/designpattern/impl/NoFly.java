package org.designpattern.impl;

import org.designpattern.FlyBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
