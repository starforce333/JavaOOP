package lesson11.school;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        String url = "https://prog.kiev.ua/forum/index.php/board,2.0.html";
//
//        String text = "";
//        try {
//            text = Network.getStringFromURL(url, "UTF-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(text);

//        String url = "https://prog.kiev.ua/images/logo100.png";
//        File folder = new File("AAA");
//        folder.mkdirs();
//
//        try {
//            Network.saveFileFromURL(url, folder);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Done!");
//
//        Map <String, List<String>> headers = null;
//
//        try {
//            headers = Network.getHeaderFromURL(url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        headers.forEach((key, value) -> System.out.println(key + " - " + value));

        File in = new File("urls.txt");
        File out = new File("urls_clear.txt");

        Set<String> list = URLS.deleteDuplicates(in, out);

        System.out.println(list);
        System.out.println();
        list.forEach((value) -> {
            try {
                System.out.println(URLS.code(value));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
