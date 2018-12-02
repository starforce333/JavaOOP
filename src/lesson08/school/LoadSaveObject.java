package lesson08.school;

import java.io.*;

public class LoadSaveObject {

    public static void saveObject(File file, Object obj) throws IOException {
        try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {

            oos.writeObject(obj);

        } catch (IOException e) {
            throw e;
        }
    }

    public static Object loadObject (File file) throws IOException, ClassNotFoundException {
        try (ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
            return ois.readObject();
        } catch (IOException e) {
            throw e;
        }
    }
}
