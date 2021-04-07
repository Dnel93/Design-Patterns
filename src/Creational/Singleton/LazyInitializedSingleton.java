package Creational.Singleton;

/*
    This kind of implementation works fine in case of single-threaded environment but when it comes to multi-threaded
    systems, it can cause issues if multiple threads are inside the if condition at the same time. IT will destroy
    the singleton pattern and both threads will get the different instances of the singleton class.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }

}
