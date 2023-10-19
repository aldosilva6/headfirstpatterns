package org.designpattern.duck;

import org.designpattern.duck.impl.FlyRocketPowerd;

/**
 * Hello world!
 *
 */
public class DuckSimulator
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}
