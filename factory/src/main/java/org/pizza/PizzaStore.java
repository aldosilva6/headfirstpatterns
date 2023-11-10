package org.pizza;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Provide an abstract interface to create one product
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
