package org.designpattern.duck.impl;

import org.designpattern.duck.QuackBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
