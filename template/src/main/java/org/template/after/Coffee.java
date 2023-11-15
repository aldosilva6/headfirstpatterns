package org.template.after;

/**
 * Created by ainacio on Nov, 2023
 */
public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Brew coffee in boiling water");
    }
}
