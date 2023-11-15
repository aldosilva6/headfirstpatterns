package org.template;

/**
 * Created by ainacio on Nov, 2023
 */
public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("Add sugar and milk");
    }

    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Brew coffee in boiling water");
    }

    private void boilWater() {
        System.out.println("Boil some water");
    }
}
