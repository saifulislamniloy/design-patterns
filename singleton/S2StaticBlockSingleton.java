package singleton;

/* StaticBlockSingleton
 * --------------------
 * 1. Singleton instance is created during class loading ✅
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ❌
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * 6. Survive reflection api ❌
 * */
public class S2StaticBlockSingleton {
    private static S2StaticBlockSingleton instance;

    private S2StaticBlockSingleton() {
    }

    static {
        try {
            instance = new S2StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static S2StaticBlockSingleton getInstance() {
        return instance;
    }
}
