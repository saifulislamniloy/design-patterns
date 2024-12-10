package singleton;

/* S6BillPughSingleton
 * -------------------
 * 1. Singleton instance is created during class loading ❌
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ✅
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * 6. Survive reflection api ❌
 * */
public class S6BillPughSingleton {

    private S6BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final S6BillPughSingleton INSTANCE = new S6BillPughSingleton();
    }

    public static S6BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
