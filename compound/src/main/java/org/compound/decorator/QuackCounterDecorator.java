package org.compound.decorator;

import org.compound.Quackable;
import org.compound.observer.Observable;
import org.compound.observer.Observer;

/**
 * Created by ainacio on Nov, 2023
 */
public class QuackCounterDecorator implements Quackable {

    Quackable duck;

    public static int numberOfQuacks;

    public QuackCounterDecorator(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    public String toString() {
        return duck.toString();
    }
}
