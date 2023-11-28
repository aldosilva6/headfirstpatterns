package org.compound;

import org.compound.observer.Observable;
import org.compound.observer.Observer;

/**
 * Created by ainacio on Nov, 2023
 */
public class RedheadDuck implements Quackable{

    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return "Redhead Duck";
    }
}
