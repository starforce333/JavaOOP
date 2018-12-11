package lesson11.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class URLS {

    public static void deleteDuplicates(File in, File out) {
        Map<String, Integer> myMap = fileToMap(in);
        StringBuilder noDuplicates = new StringBuilder();
        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            noDuplicates.append(key + System.lineSeparator());
        }
        noDuplicates.setLength(noDuplicates.length() - 2);
        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println(noDuplicates.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Integer> fileToMap(File in) {
        Map<String, Integer> myMap = null;
        String str = "";
        try {
            Scanner sc = new Scanner(in);
            while (sc.hasNext()) {
                str = sc.nextLine();
                myMap.put(str, 1);
            }
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
        return myMap;
    }
}
