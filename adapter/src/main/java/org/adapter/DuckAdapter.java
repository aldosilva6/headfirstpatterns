package org.adapter;

/**
 * Created by ainacio on Nov, 2023
 */
public class DuckAdapter implements Turkey{
    
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }


    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
