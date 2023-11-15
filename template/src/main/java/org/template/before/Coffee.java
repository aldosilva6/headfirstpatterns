package org.template.before;

/**
 * Created by ainacio on Nov, 2023
 */
public class Coffee extends CaffeineBeverage {
    /**
     * Very similar to tea
     */
    @Override
    void prepareRecipe() {
        addSugarAndMilk();
        boilWater();
        pourInCup();
        brewCoffeeGrinds();
    }

    public void brewCoffeeGrinds(){
        System.out.println("Brew coffee in boiling water");
    }

    public void addSugarAndMilk(){
        System.out.println("Add sugar and milk");
    }
}
