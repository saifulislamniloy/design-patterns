package singleton;

/* LazyInitializedSingleton
 * ------------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ❌
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * 6. Survive reflection api ❌
 * */
public class S3LazyInitializedSingleton {
    private static S3LazyInitializedSingleton instance;

    private S3LazyInitializedSingleton(){}

    public static S3LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new S3LazyInitializedSingleton();
        }
        return instance;
    }
}
