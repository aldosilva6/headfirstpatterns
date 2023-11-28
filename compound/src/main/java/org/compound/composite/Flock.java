package org.compound.composite;

import org.compound.Quackable;
import org.compound.observer.Observable;
import org.compound.observer.Observer;

import java.util.*;

/**
 * Created by ainacio on Nov, 2023
 */
public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable){
        quackers.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable duck = iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
    public String toString() {
        return "Flock of Ducks";
    }
}
