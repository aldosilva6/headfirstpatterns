package org.template.wildworld;

import java.util.Arrays;

/**
 * Created by ainacio on Nov, 2023
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Daffy", 8),
                new Duck("Dewy", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)};
        System.out.println("Before sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck: ducks){
            System.out.println(duck);
        }
    }
}
