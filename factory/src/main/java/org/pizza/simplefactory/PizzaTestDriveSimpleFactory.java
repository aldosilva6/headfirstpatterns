package org.pizza.simplefactory;

import org.pizza.Pizza;

/**
 * Hello world!
 *
 */
public class PizzaTestDriveSimpleFactory
{
    public static void main( String[] args )
    {
        PizzaStore nyStore = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
