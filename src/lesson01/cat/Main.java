package lesson01.cat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Cat catOne = new Cat();
        catOne.setName("Barsik");
        catOne.setBreed("Scottish");
        catOne.setAge(3);
        catOne.setWeight(6);
        catOne.setGender("male");


        Cat catTwo = new Cat("Murka", "Brittish", 5, 5, "female");


        System.out.println(catOne);
        System.out.println();
        catOne.sayMeow();
        System.out.println();
        System.out.println(catTwo);
        String cats = catOne.toString() + System.lineSeparator() + catTwo.toString();

        File myCats = new File("cats.txt");
        try {
            myCats.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToFile(myCats, cats);

    }

    private static File writeToFile(File file, String str) {
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}