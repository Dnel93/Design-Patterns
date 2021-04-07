package Creational.Singleton;

/*
    It is similar to EagerInitializedSingleton, but this one will take care of any issue presented during the creation
    of our singleton instance.
 */
public class StaticBlockInitialization {
    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {}

    // Static block is used ot initialize the static variables of the class. Mostly it's used to create static
    // resources when the class is loaded
    static {
        try {
            instance = new StaticBlockInitialization();
        } catch ( Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return instance;
    }
}
