import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSV {

    public static void main(String[] args) throws IOException {
        String filePath = "./Data.csv";
        BufferedReader reader = null;
        String line = "";
        try {

            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    System.out.printf("%-3s", index);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            reader.close();
        }
    }

}