package org.designpattern;

import org.designpattern.impl.FlyRocketPowerd;

/**
 * Hello world!
 *
 */
public class DuckSimulator
{
    public static void main( String[] args )
    {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();

        /*Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/
    }
}
