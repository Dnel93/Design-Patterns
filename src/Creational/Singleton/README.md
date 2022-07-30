# Creation | Singleton

---
## Eager Initialized Singleton

---
In eager initialization, the instance of `Creational.Singleton` class, is created at the time of class loading, 
this is the easiest method to create a singleton class, but it has a drawback the instance is created even though 
client application might not be using it.

## Lazy Initialized Singleton

---
This kind of implementation works fine in case of `single-threaded environment`, but when it comes to multi-threaded 
systems, it can cause issues if multiple threads are inside the if condition at the sametime.  
It will destroy  the singleton pattern and both threads will get the different instances of the singleton class.

## Static Block Initialization Singleton

---
It is similar to `EagerInitializedSingleton`, but this one will take care of any issue presented during the creation of 
our singleton instance.

## Thread Safe Singleton

---
The easier way to create a `thread-safe singleton` class is to make the global access method synchronized, so that only 
one thread can execute this method at a time.  

This implementation works fine and provides a `thread-safe singleton` but it reduces the performance because of the 
**cost** associated with the synchronized method, although we need it only for the first few threads who might create the 
separate instance.  

To avoid this extra overhead every time, double-checked locking principle is used. In this approach, the synchronized 
block is used inside the if condition with an additional check to ensure that only one instance of a singleton class 
is created.