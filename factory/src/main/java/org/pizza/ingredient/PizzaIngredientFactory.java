package org.pizza.ingredient;

/**
 * Created by ainacio on Nov, 2023
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
