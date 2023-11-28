package org.compound.observer;

/**
 * Created by ainacio on Nov, 2023
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
