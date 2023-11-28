package org.compound;

import org.compound.observer.QuackObservable;

/**
 * Created by ainacio on Nov, 2023
 */
public interface Quackable extends QuackObservable {

    public void quack();
}
