package org.template.before;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class CaffeineBeverage {

    /**
     * Each subclass can prepare the beverage in their own way
     * and can put the things in the wrong order
     */
    abstract void prepareRecipe();

    void boilWater(){
        System.out.println("Boil some water");
    };

    void pourInCup(){
        System.out.println("Pour in cup");
    };
}
