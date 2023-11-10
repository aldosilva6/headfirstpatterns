package org.pizza;

import org.pizza.ingredient.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Veggie[] veggies;

    protected Pepperoni pepperoni;

    protected Clams clam;
    protected List<String> toppings = new ArrayList<>();
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
