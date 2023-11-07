package org.pizza.simplefactory;

import org.pizza.Pizza;

/**
 * Created by ainacio on Nov, 2023
 */
public class PizzaStore {

     SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * For each new Pizza this code needs to change.
     *
     * Move to a object that is only going to be concerned with creating pizza.
     *
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }

}
