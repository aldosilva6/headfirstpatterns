# Strategy Pattern
Defines a family of algorithms, encapsulate each one, and makes them interchangeable. Strategy lets the algorithm vary
independently from clients that use it.

Favor composition over inheritance.

With inheritance, you make code duplications, add behavior to classes that doesn't need, more difficult to maintain.

BEFORE

![img.png](src/images/img.png)

Take the parts that vary ad encapsulate them, so that later you can alter or extend the parts that vary without affecting
those that don't

AFTER

![img_1.png](src/images/img_1.png)

Change behavior at runtime

```
public class DuckSimulator
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}

OUTPUT
//MallardDuck
Quack!
I'm flying with wings

//ModelDuck
I can't fly
Quack!
I'm a flying with a rocket

```