package Creational.Singleton;

public class Main {

    public static void main(String[] args) {

        LazyInitializedSingleton firstInstance = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton secondInstance = LazyInitializedSingleton.getInstance();

    }
}
