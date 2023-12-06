# Adapter Pattern
A goose came along and wanted to act like a Quackable too.So we used the `Adapter Pattern` to adapt the goose to a Quackable.

# Decorator Pattern
The Quackologists decided they wanted to count quacks. So we used the `Decorator Pattern` to add a QuackCounter decorator that
keeps track of the number of times quack() is called, and then delegates the quack to the Quackable it's wrapping

# Abstract Factory
The Quackologists were worried to forget to add the QuackCounter decorator. So we used the `Abstract Factory Pattern` to create
ducks for them

# Composite Pattern
We had management problems keeping track of all those ducks and geese and Quackable. So we used `Composite Pattern` to group 
Quackables into Flocks. Also allows the Quackologists to create subFolks to manage duck families.

# Observer Pattern
The Quackologists also wanted to be notified when any Quackable quacked. So we used `Observer Pattern` to let Quackologists register
as Quackable Observers. Now they're notified every time any Quackable quacks.

# MVC Pattern
Model View Controller - it's just a few patterns put together.  
![img.png](img.png)

The `Model` uses Observer to keep views and controller updated on the latest state changes.  
The `View` and the `Controller`, on the other hand, implement the Strategy Pattern. The `Controller` is the strategy of the view,
and it can be easily exchanged with another controller if want different behavior.
The `View` itself also uses a pattern internally to manage the windows, buttons, and other components of the display: The Composite Pattern.