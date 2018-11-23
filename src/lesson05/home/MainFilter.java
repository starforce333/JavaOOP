package lesson05.home;

import java.io.*;

public class MainFilter {
    public static void main(String[] args) {
        FileFilter filt = new MyFileFilter("pdf");
        File folderFrom = new File("folderFrom");
        File folderTo = new File("folderTo");

        try {
            FileOperation.copyFolder(folderFrom, folderTo, filt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}