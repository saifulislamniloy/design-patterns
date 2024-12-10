package singleton;

/* StaticBlockSingleton
 * --------------------
 * 1. Singleton instance is created during class loading ✅
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ❌
 * 4. Option for exception handling during instance creation ✅
 * */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
