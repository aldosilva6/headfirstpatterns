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
