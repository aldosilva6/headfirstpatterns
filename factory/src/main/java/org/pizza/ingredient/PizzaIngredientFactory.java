package org.pizza.ingredient;

/**
 * Created by ainacio on Nov, 2023
 *
 * AbstractFactory - Provides an abstract interface for creating a family of products.
 *
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
