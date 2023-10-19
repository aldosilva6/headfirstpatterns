package org.designpattern.duck.impl;

import org.designpattern.duck.QuackBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack!");
    }
}
