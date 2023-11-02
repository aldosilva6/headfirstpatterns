package org.starbuzz;

/**
 * Hello world!
 *
 */
public class Starbuzz
{
    public static void main( String[] args )
    {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " Cost:" + espresso.cost());

        Beverage darkRoast = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(darkRoast.getDescription() + " Cost:" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.Size.GRANDE);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()
                + " $" + String.format("%.2f", houseBlend.cost()));
    }
}
