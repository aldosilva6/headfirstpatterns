package org.designpattern.duck;

import org.designpattern.duck.impl.Quack;
import org.designpattern.duck.impl.NoFly;

/**
 * Created by ainacio on Oct, 2023
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new NoFly();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
