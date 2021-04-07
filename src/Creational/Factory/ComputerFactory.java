package Creational.Factory;

/*
    We have parent and child classes ready, we can implement our factory class as indicated below. (Basic implementation)

    -- IMPORTANT POINTS ABOUT FACTORY DESIGN PATTERN

    1. We can keep Creational.Factory class Creational.Singleton or we can keep the method that returns the sub class as static.
    2. Notice that based on the input parameter, different subclass is created and returned. getComputer is the factory
       method.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        return null;
    }
}
