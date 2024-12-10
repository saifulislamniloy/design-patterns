package singleton;

/* S5ThreadSafeDoubleCheckSingleton
 * --------------------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * 6. Survive reflection api ❌
 * */
public class S5ThreadSafeDoubleCheckSingleton {
    private static S5ThreadSafeDoubleCheckSingleton instance;

    private S5ThreadSafeDoubleCheckSingleton() {
    }

    public static S5ThreadSafeDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (S5ThreadSafeDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new S5ThreadSafeDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
