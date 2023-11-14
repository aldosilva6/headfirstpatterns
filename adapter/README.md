# Adapter Pattern
The adapter pattern converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise
because of incompatible interface.

Object Adapter use Compositon
Class Adapter use Inheritance - Not permited in Java because use double extends

Convert a Turkey into a Duck - Wrap the object that has an incompatible interface with an object that implements the correct one.

![img.png](src/image/img.png)


```
public static void main(String[] args) {
    Duck duck = new MallardDuck();
    Turkey turkey = new WildTurkey();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    System.out.println("The Turkey says...");
    turkey.gobble();
    turkey.fly();

    System.out.println("The Duck says...");
    testDuck(duck);
    System.out.println("The Turkey adapter says...");
    testDuck(turkeyAdapter);
}

static void testDuck(Duck duck){
    duck.quack();
    duck.fly();
}

OUTPUT
The Turkey says...
Gobble gobble
I'm flying a short distance
The Duck says...
Quack
I'm flying
The Turkey adapter says...
Gobble gobble
//Turkey needs 5 times to fly
I'm flying a short distance
I'm flying a short distance
I'm flying a short distance
I'm flying a short distance
I'm flying a short distance

```

Object adapters use composition whilst class adapters use inheritance, this makes the class adapters les adaptive
since you can't mix the behavior. With composition you can call any subclass of interface.

# Faced Pattern
It provides a simplified interface to a subsystem while still exposing the full functionality of the system to those who may need it. Facade
defines a higher-level interface that makes the subsystem easier to use.

Decoupled Client from Subsystems.

![img.png](src/image/img1.png)


```
public static void main(String[] args) {
    Amplifier amp = new Amplifier("Amplifier");
    Tuner tuner = new Tuner("AM/FM Tuner", amp);
    StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
    CdPlayer cd = new CdPlayer("CD Player", amp);
    Projector projector = new Projector("Projector", player);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    HomeTheaterFacade homeTheater = 
            new HomeTheaterFacade(amp, tuner, player, 
                    projector, screen, lights, popper);

    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
}

OUTPUT:

Get ready to watch a movie...
Popcorn Popper on
Popcorn Popper popping popcorn!
Theater Ceiling Lights dimming to 10%
Theater Screen going down
Projector on
Projector in widescreen mode (16x9 aspect ratio)
Amplifier on
Amplifier setting Streaming player to Streaming Player
Amplifier surround sound on (5 speakers, 1 subwoofer)
Amplifier setting volume to 5
Streaming Player on
Streaming Player playing "Raiders of the Lost Ark"
Shutting movie theater down...
Popcorn Popper off
Theater Ceiling Lights on
Theater Screen going up
Projector off
Amplifier off
Streaming Player stopped "Raiders of the Lost Ark"
Streaming Player off
```
Design Principle: Principle of Least Knowledge: talk only to your immediate friends. Close friends.

Decorator: Doesn't alter the interface, but adds responsibility

Adapter: Converts one interface to another

Facade: Makes an interface simpler.
