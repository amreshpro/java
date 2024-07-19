package src.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {
    


public static void main(String[] args) throws IOException {
    
FileWriter writer  = null;
String filePath = "./src/io/content.txt";

try {
    writer = new FileWriter(filePath,true);
    writer.write("I Am Amresh Maurya");
    writer.write("\n");
    
} catch (Exception e) {
   System.out.println(e.getMessage());
}finally{
    writer.close();
}


}

}
