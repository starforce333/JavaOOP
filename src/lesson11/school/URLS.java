package lesson11.school;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

public class URLS {

    private String link;
    private String status;
    Set<String> list;


    public URLS(String link, String status, Set<String> list) {
        this.link = link;
        this.status = status;
        this.list = list;
    }

    public URLS() {
    }

    public static Set<String> deleteDuplicates(File in, File out) {
        Set<String> list = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(in))) {
            String str = "";
            for (; (str = br.readLine()) != null; ) {
                list.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        System.out.println(list.size());
        saveFile(list, out);
        return list;
    }

    private static void saveFile(Set<String> list, File out) {
        StringBuilder sb = new StringBuilder();

        list.forEach((value) -> sb.append(value + System.lineSeparator()));
        String clear = sb.toString();
        try (PrintWriter pw = new PrintWriter(out)) {
            pw.println(clear);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static String code(String url) throws IOException {
        URL urlCon = new URL(url);
        String code = "";
        try {
            HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
            code = connection.getResponseMessage();
        } catch (UnknownHostException e) {
            System.out.println(url + " doesn't exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;
    }

    @Override
    public String toString() {
        return "URLS{" +
                "link='" + link + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
