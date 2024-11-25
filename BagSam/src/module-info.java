import java.util.*;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {} // Private constructor

    public static Singleton getInstance() {
        return instance;
    }
}
