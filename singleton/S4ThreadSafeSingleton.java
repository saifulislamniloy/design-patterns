package singleton;

/* S4ThreadSafeSingleton
 * ---------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ❌
 * 6. Survive reflection api ❌
 * */
public class S4ThreadSafeSingleton {
    private static S4ThreadSafeSingleton instance;

    private S4ThreadSafeSingleton() {
    }

    public static synchronized S4ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new S4ThreadSafeSingleton();
        }
        return instance;
    }
}
