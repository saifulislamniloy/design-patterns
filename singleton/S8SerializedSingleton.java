package singleton;

import java.io.Serial;
import java.io.Serializable;

public class S8SerializedSingleton implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private S8SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final S8SerializedSingleton INSTANCE = new S8SerializedSingleton();
    }

    public static S8SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}

