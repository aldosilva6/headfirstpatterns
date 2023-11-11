# Singleton Pattern 
-The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

-Provides a global access point
-Consider all applications multithreaded
-Can use Enums to simplify implementation
-


Questions:
Lazy Instantiation - Synchronize getInstance
1- Synchronize is expensive since all calls to the method getInstance will be synchronized 
```
public static synchronized ChocolateBoiler getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
```

Eager instantiation
2- If the class make a lot of things can be heavy to load all the application. And you can instantiate the class without using.
```
public static Singleton instance = new Singleton();
```

Double check - volatile
3- With Java early version 1.4 is not possible to use this class.
This way we only synchronized for the first time the instance is created
```
   private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
```

The volatile keyword in Java is used to indicate that a variable's value may be modified by multiple threads simultaneously. 
It ensures that the variable is always read from and written to the main memory, rather than from thread-specific caches, ensuring visibility across threads.