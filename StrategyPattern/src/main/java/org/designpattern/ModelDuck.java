package org.designpattern;

import org.designpattern.impl.NoFly;
import org.designpattern.impl.Quack;

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
