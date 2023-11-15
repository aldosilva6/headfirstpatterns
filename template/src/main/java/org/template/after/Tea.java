package org.template.after;

/**
 * Created by ainacio on Nov, 2023
 */
public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");
    }

    /**
     * If subclass doesn't want to add condiments
     * @return
     */
    @Override
    public boolean customerWantsCondiments(){
        //Could be from a button
        return false;
    }

    @Override
    protected void brew() {
        System.out.println("Steep tea in boiling water");
    }
}
