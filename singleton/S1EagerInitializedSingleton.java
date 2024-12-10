package singleton;

/* EagerInitializedSingleton
 * --------------------------
 * 1. Singleton instance is created during class loading ✅
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ❌
 * 4. Option for exception handling during instance creation ❌
 * 5. Performance efficient ✅
 * 6. Survive reflection api ❌
 * */
public class S1EagerInitializedSingleton {
    private static final S1EagerInitializedSingleton instance = new S1EagerInitializedSingleton();

    private S1EagerInitializedSingleton() {
    }

    public static S1EagerInitializedSingleton getInstance() {
        return instance;
    }
}
