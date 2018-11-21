package lesson05.school;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        File file = new File("text.txt");

        try (InputStream is = new FileInputStream(file)) {

            byte[] buffer = new byte[7];
            int readByte = is.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println(readByte);
            readByte = is.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println(readByte);



//            int s = is.read();
//            System.out.println(s);

//            int n = is.available();
//            System.out.println(n);
//            System.out.println(is.markSupported());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
