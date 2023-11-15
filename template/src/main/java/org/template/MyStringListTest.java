package org.template;

import java.util.List;

/**
 * Created by ainacio on Nov, 2023
 */
public class MyStringListTest {

    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks);
        List<String> subList = duckList.subList(2, 3);
        subList.forEach(o -> System.out.println(o));
    }
}
