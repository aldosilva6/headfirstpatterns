package org.visitor;

/**
 * Created by ainacio on Dec, 2023
 */
public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20,"1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppinCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for(ItemElement itemElement: items){
            sum = sum + itemElement.accept(visitor);
        }

        return sum;
    }
}
