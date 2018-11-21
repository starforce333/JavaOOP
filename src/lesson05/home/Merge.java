package lesson05.home;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        File fileOne = new File("1.txt");
        File fileTwo = new File("2.txt");
        String one = read(fileOne);
        String two = read(fileTwo);
        String[] oneArr = split(one);
        String[] twoArr = split(two);

        System.out.println("One: " + System.lineSeparator() + one);
        System.out.println("Two: " + System.lineSeparator() + two);
        System.out.println();
        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));

        System.out.println("Result: " + check(oneArr, twoArr));

        writeToFile(check(oneArr, twoArr));

    }

    private static void writeToFile(String check) {
        File file = new File("merge.txt");
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(check);
        } catch (IOException e) {

        }
    }

    private static String check(String[] oneArr, String[] twoArr) {
        String result = "";
        for (int i = 0; i < oneArr.length; i++) {
            for (int j = 0; j < twoArr.length; j++) {
                if (oneArr[i].equalsIgnoreCase(twoArr[j])) {
                    result+= oneArr[i] + " ";
                }
            }

        }

        return result;
    }


    private static String read(File file) {
        String str = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            str = reader.readLine();

        } catch (IOException e) {

        }
        return str;
    }

    private static String[] split(String string) {
        String[] split = string.split(" ");


        return split;
    }
}


//    Напишите программу, которая скопирует файлы с заранее
//    определенным  расширением(например,  только  doc)  из
//    каталога источника в каталог приемник.
//        2.  Напишите  программу,  которая  примет  на  вход  два
//        текстовых  файла,  а  вернет  один.  Содержимым  этого  файла
//        должны быть слова, которые одновременно есть и в первом и
//        во втором файле.
