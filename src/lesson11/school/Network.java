package lesson11.school;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Network {

    public static String getStringFromURL(String url, String code) throws IOException {

        URL urlCon = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        String result = "";
        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, code));
        String temp = "";
        for (; (temp = br.readLine()) != null; ) {
            result += temp + System.lineSeparator();
        }
        return result;
    }

    public static void saveFileFromURL(String url, File folder) throws IOException {

        int n = url.lastIndexOf("/");
        String fileName = url.substring(n + 1);
        URL urlCon = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        InputStream is = connection.getInputStream();

        File file = new File(folder, fileName);
        OutputStream os = new FileOutputStream(file);

        streamCopy(is, os);

    }

    public static void streamCopy(InputStream is, OutputStream os) throws IOException {

        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        for (; (readByte = is.read(buffer)) > 0; ) {
            os.write(buffer, 0, readByte);
        }
    }

    public static Map<String, List<String>> getHeaderFromURL (String url) throws IOException {
        URL urlCon = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        return connection.getHeaderFields();
    }
}