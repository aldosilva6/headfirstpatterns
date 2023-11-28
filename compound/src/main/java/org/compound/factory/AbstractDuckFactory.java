package org.compound.factory;

import org.compound.Quackable;

/**
 * Created by ainacio on Nov, 2023
 *
 * To standardize Duck creation. We create a polymorphic method that takes
 * a factory and use it to create objects.
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();

    public abstract Quackable createRubberDuck();

    public abstract Quackable createDuckCall();
}
