package singleton;

import java.io.*;

public class TestS8SerializedSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        S8SerializedSingleton instanceOne = S8SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        S8SerializedSingleton instanceTwo = (S8SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

    }

}
