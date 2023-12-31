package org.compound;

import org.compound.observer.Observable;
import org.compound.observer.Observer;

/**
 * Created by ainacio on Nov, 2023
 */
public class DuckCall implements Quackable{

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
        return "DuckCall Duck";
    }
}
