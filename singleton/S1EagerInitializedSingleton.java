package singleton;

/* EagerInitializedSingleton
 * --------------------------
 * 1. Singleton instance is created during class loading ✅
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ❌
 * 4. Option for exception handling during instance creation ❌
 * */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static singleton.EagerInitializedSingleton getInstance() {
        return instance;
    }
}
