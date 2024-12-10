package singleton;

/* LazyInitializedSingleton
 * ------------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * */
public class S5ThreadSafeDoubleLockSingleton {
    private static S5ThreadSafeDoubleLockSingleton instance;

    private S5ThreadSafeDoubleLockSingleton() {
    }

    public static synchronized S5ThreadSafeDoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (S5ThreadSafeDoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new S5ThreadSafeDoubleLockSingleton();
                }
            }
        }
        return instance;
    }
}
