package singleton;

/* LazyInitializedSingleton
 * ------------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
