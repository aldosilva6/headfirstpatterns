# Iterator Pattern
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Design Principle: A class should have only one reason to change.More than one responsibility means more than one area of change.

If you don't have a single interface to aggregate you need to implement two fors to iterate to two different data structures: ArrayList and Array

BEFORE

![img.png](src/images/img.png)

Create a method that implements the same interface Iterator

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