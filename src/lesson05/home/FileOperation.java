package lesson05.home;

import java.io.*;

public class FileOperation {

    public static void copyFile(File from, File to) throws IOException {
        if (from == null || to == null) {
            throw new IllegalArgumentException("null file pointer");
        }
        try (InputStream fis = new FileInputStream(from);
             OutputStream fos = new FileOutputStream(to)) {
            byte[] buffer = new byte[1024 * 1024];
            int readByte = 0;
            for (; (readByte = fis.read(buffer)) > 0; ) {
                fos.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public static void copyFolder(File folderFrom, File folderTo, FileFilter ffilt) throws IOException {
        if (folderFrom == null || folderTo == null || ffilt == null) {
            throw new IllegalArgumentException("null file pointer");
        }

        File[] files = folderFrom.listFiles(ffilt);
        for (File file : files) {
            copyFile(file, new File(folderTo, file.getName()));
        }
    }
}
