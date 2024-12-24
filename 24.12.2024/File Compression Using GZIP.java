import java.io.*;
import java.util.zip.GZIPOutputStream;

public class FileCompressor {
    public static void main(String[] args) {
        String inputFile = "input.txt";  // Provide the path of the file to compress
        String compressedFile = "input.txt.gz";

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(compressedFile);
             GZIPOutputStream gzip = new GZIPOutputStream(fos)) {

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                gzip.write(buffer, 0, len);
            }
            System.out.println("File compressed successfully: " + compressedFile);
        } catch (IOException e) {
            System.err.println("Error compressing file: " + e.getMessage());
        }
    }
}
