package org.pizza.chicago;

import org.pizza.Pizza;
import org.pizza.PizzaStore;

/**
 * Created by ainacio on Nov, 2023
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        } else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
