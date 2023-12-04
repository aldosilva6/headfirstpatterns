# headfirstpatterns

### Thinking in patterns
Center your thinking on design, not on patterns. Use patterns when there is a natural neeed for them. If something simpler will work, then use it.

Introduce a pattern when you are sure it's necessary to solve a problem in your design, or when you are quite sure that it is needed to deal with a future
change in the requirements of your application.

**WARNING**
Overuse of design patterns can lead to code that is downright overengineered. Always go with the simplest solution that does the job and introduce patterns where
the need emerges.

**Problem**: How do I get to work on time?

**Context**: I've locked my keys in the car.

**Solution**: Break the window, get in the car, start the engine, and drive to work.

No. You are going to break a window. Yes, this is a workaround.

Decorator - wraps an object provide a new behavior.

Adapter - wraps an object and provides a different interface to it.

Factory Method - subclasses decide how to implement steps in an algorithm

Template method - Subclases decide which concrete classes to create.

Singleton - Ensures one and only one object is created.

Strategy - Encapsulates interchangeable beahaviors and uses delegation to decide which one to use.

Composite - Clients treat collections of objects and individual objects uniformly.

State - Encapsulates state-based behaviors and uses delegation to switch between behaviors.

Iterator - Provides a way to traverse a collection of objects without exposing its implementation.

Facade - Simplifies the interface of a set of classes.

Abstract Factory - Allows a cliente to create families of objects without specifying their concrete classes.

Observer - Allows objects to be notified when state changes.

Proxy - Wraps an object to control access to it.

Command - Encapsulates a request as an object.

**Creational**
Factory Method - Abstract Factory - Singleton

**Behavioral**
Strategy - Observer - State - Template method - Iterator - Command

**Structural**
Decorator - Proxy - Adapter - Facade - Composite





