package src.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        File file1 = null;
        String filePath = "./src/io/content.txt";

        try {

            reader = new FileReader(filePath);
            file1 = new File(filePath);
            char ch[] = new char[(int) file1.length()];
            reader.read(ch);

            for (char x : ch) {
                System.out.println(x);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }

}
