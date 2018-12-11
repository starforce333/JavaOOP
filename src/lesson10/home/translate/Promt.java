package lesson10.home.translate;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Promt {
    private Map<String, String> myMap = new HashMap<>();
    private DicUpdate update;

    public Promt() {
    }

    public String loadFile(File file) {

        StringBuilder str = new StringBuilder();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                str.append(sc.nextLine().toLowerCase());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public void saveFile(String str, File out) {
        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> fileToMap(File file) {

        String str = "";
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                myMap.put(str.substring(0, str.lastIndexOf('|')), str.substring(str.lastIndexOf('|') + 1));
            }
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
        return myMap;
    }

    public Map<String, String> checkDic(File eng, File dic) {
        String english = loadFile(eng);
        myMap = fileToMap(dic);
        String[] array = english.split("[ .,]");
        for (int i = 0; i < array.length; i++) {
            String temp = myMap.get(array[i]);
            if (temp == null) {
                try {
                    myMap.put(array[i], String.valueOf(JOptionPane.showInputDialog("Input translation of word " + array[i])));
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Cancel");
                }
            }
        }
        saveNewDic(myMap, dic);
        return myMap;
    }

    public void saveNewDic(Map<String, String> map, File dic) {
        StringBuilder sb = new StringBuilder();
        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            sb.append(key + "|" + myMap.get(key) + System.lineSeparator());
        }
        sb.setLength(sb.length() - 2);
        try (PrintWriter pw = new PrintWriter(dic)) {
            pw.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateDic(File dic) {
        myMap = fileToMap(dic);
        for (; ; ) {
            try {
                String word = String.valueOf(JOptionPane.showInputDialog("Input new word or press Cancel"));
                String temp = myMap.get(word);
                if (temp == null && word != null) {
                    myMap.put(word, String.valueOf(JOptionPane.showInputDialog("Input translation of word " + word)));
                } else {
                    System.out.println("Finishing operation...");
                    break;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Cancel");
            }
        }
        saveNewDic(myMap, dic);
        System.out.println("New dictionary saved");
    }

    public String translate(File eng, File dic) {
        String english = loadFile(eng);
        myMap = checkDic(eng, dic);
        String[] array = english.split("[ .,]");
        StringBuilder translation = new StringBuilder();
        for (String s : array) {
            translation.append(myMap.get(s) + " ");
        }
        return translation.toString();
    }
}