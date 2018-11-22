package lesson05.home;

import java.io.File;

public class MainFilter {
    public static void main(String[] args) {
        MyFileFilter mFF = new MyFileFilter("doc", "pdf");
        File folder = new File("myFolder");
        File[] fileList = folder.listFiles(mFF);
        for (File file : fileList) {
            System.out.println(file);
        }
    }

}


//    Напишите программу, которая скопирует файлы с заранее
//    определенным  расширением(например,  только  doc)  из
//    каталога источника в каталог приемник.