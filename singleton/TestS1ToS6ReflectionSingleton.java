package singleton;

import java.lang.reflect.Constructor;

public class TestS1ToS6ReflectionSingleton {

    public static void main(String[] args) {
        S5ThreadSafeDoubleCheckSingleton instanceOne = S5ThreadSafeDoubleCheckSingleton.getInstance();
        S5ThreadSafeDoubleCheckSingleton instanceTwo = null;
        try {
            Constructor[] constructors = S5ThreadSafeDoubleCheckSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (S5ThreadSafeDoubleCheckSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}
