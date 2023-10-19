package org.designpattern.duck;

import org.designpattern.duck.impl.Quack;
import org.designpattern.duck.impl.Squack;

/**
 * Created by ainacio on Oct, 2023
 */
public class DuckCallSimulator {

    public static void main(String[] args) {
        DuckCall duckCall = new DuckCall();
        duckCall.setQuackBehavior(new Squack());

        duckCall.performQuack();

        duckCall.setQuackBehavior(new Quack());
        duckCall.performQuack();
    }
}
