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
        catOne.setSex("male");


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


//        3)  Описать  класс  «Vector3d»  (т. е.,  он  должен  описывать  вектор  в  трехмерной,
//        декартовой  системе  координат).  В  качестве  свойств  этого  класса  возьмите
//        координаты вектора. Для этого класса реализовать методы сложения,  скалярного и
//        векторного  произведения  векторов.  Создайте  несколько  объектов  этого  класса  и
//        протестируйте их.
//        4) Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//        класс  Network  (сеть  мобильного  оператора).  Телефон  должен  иметь  метод
//        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//        (номер другого телефона), который переберет все телефоны, зарегистрированные в
//        сети.  Если  такой  номер  будет  найден,  то  осуществить  вызов,  если  нет  -  вывести
//        сообщение об ошибочности набранного номера.