package Singleton;

public class Singleton {
    
    private static final Singleton bag1 = new Singleton();

    private Singleton() {
        System.out.println("Constructor called");
    }

    public static Singleton display() {
        System.out.println("display called");
        return bag1;
    }
}
