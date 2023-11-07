package org.pizza.simplefactory;

import org.pizza.Pizza;
import org.pizza.CheesePizza;
import org.pizza.GreekPizza;
import org.pizza.PepperoniPizza;
import org.pizza.VeggiePizza;

/**
 * Created by ainacio on Nov, 2023
 *
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if(type.equals("clam")){
            pizza = new GreekPizza();
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
