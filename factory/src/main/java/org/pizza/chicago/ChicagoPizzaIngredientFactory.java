package org.pizza.chicago;

import org.pizza.ingredient.*;

/**
 * Created by ainacio on Nov, 2023
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new VeryThimCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
