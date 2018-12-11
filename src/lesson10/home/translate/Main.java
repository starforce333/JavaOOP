package lesson10.home.translate;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("English.txt");
        File fileTwo = new File("dic.txt");
        File fileDic = new File("dicUpd.txt");
        File fileThree = new File("UA.txt");
        Promt translation = new Promt();

        translation.checkDic(file, fileTwo);

        String text = translation.translate(file, fileTwo);
        System.out.println(text);

        translation.saveFile(text, fileThree);
        translation.updateDic(fileDic);
    }
}