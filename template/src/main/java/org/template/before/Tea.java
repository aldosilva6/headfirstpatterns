package org.template.before;

/**
 * Created by ainacio on Nov, 2023
 */
public class Tea extends CaffeineBeverage{
    /**
     * Very similar to coffee
     */
    @Override
    void prepareRecipe() {
        steepTeaBag();
        boilWater();
        addLemon();
        pourInCup();
    }

    public void steepTeaBag(){
        System.out.println("Steep tea in boiling water");
    }

    public void addLemon(){
        System.out.println("Add lemon");
    }
}
