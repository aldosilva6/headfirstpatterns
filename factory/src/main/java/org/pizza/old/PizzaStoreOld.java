package org.pizza.old;

import org.pizza.*;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class PizzaStoreOld {

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

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            pizza = new DefaultPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
