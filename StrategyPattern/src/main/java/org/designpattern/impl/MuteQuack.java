package org.designpattern.impl;

import org.designpattern.QuackBehavior;

/**
 * Created by ainacio on Oct, 2023
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
