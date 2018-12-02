package lesson08.school;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Vaska", "White", 3);
        Cat kitty = new Cat("Vaska", "White", 3);


        System.out.println(cat.hashCode());
        System.out.println(kitty.hashCode());
        System.out.println();

        Cat catThree = null;
        try {
            catThree = cat.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(cat == kitty);
        System.out.println(cat.equals(kitty));
        System.out.println(cat.equals(catThree));
        System.out.println();

        Class catClass = Cat.class;
//        or
//        Class catClass = cat.getClass();

        Field[] fields = catClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);

        }
        System.out.println();

        Method[] methods = catClass.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);

        }
        System.out.println();

        Constructor[] constructor = catClass.getDeclaredConstructors();
        for (int i = 0; i < constructor.length; i++) {
            System.out.println(constructor[i]);

        }
        System.out.println();

        try {
            Field catAge = catClass.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(cat, 100500);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(cat);
        System.out.println();

        System.out.println(cat.getClass().equals(Cat.class));

        File file = new File("cat.txt");

        try {
            LoadSaveObject.saveObject(file, cat);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Cat catFour = null;
        try {
            catFour = (Cat) LoadSaveObject.loadObject(file);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(catFour);

    }
}
