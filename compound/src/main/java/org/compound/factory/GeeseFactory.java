package org.compound.factory;

import org.compound.Goose;
import org.compound.Quackable;
import org.compound.adapter.GooseAdapter;

/**
 * Created by ainacio on Nov, 2023
 */
public class GeeseFactory extends AbstractGeeseFactory{
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
