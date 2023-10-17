package org.designpattern;

import org.designpattern.impl.FlyWithWings;
import org.designpattern.impl.Quack;

/**
 * Created by ainacio on Oct, 2023
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is a MallardDuck");
    }
}
