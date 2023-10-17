package org.designpattern.impl;

import org.designpattern.FlyBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
