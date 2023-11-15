package org.template.after;

/**
 * Created by ainacio on Nov, 2023
 */
public abstract class CaffeineBeverage {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        //hook
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling watter");
    }
}
