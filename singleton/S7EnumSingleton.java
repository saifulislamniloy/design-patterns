package singleton;

/* S7EnumSingleton
 * ---------------
 * 1. Singleton instance is created during class loading ✅
 * 2. Thread-safe ✅
 * 3. Instance creation on demand ❌
 * 4. Option for exception handling during instance creation ✅
 * 5. Performance efficient ✅
 * 6. Survive reflection api ✅
 * */
public enum S7EnumSingleton {
    INSTANCE;

    public static void doSomething() {
        System.out.println("This is enum singleton");
    }
}