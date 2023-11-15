package org.template.before;

/**
 * Created by ainacio on Nov, 2023
 */
public class CaffeineBeverageTest {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("---------------------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
