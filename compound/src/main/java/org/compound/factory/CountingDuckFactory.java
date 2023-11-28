package org.compound.factory;

import org.compound.*;
import org.compound.decorator.QuackCounterDecorator;

/**
 * Created by ainacio on Nov, 2023
 *
 * To not forget to decorate before create a Duck
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounterDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounterDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounterDecorator(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounterDecorator(new DuckCall());
    }
}
