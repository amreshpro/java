package src.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferRead {

public static void main(String[] args) throws IOException {
  
    File file=null;
    FileReader reader=null;
    BufferedReader breader=null;

    try {


         file = new File("./src/io/content.txt");
         reader = new FileReader(file);
         breader = new BufferedReader(reader);
         String line =breader.readLine();
        
         while (line!=null) {
            System.out.println(line);
            line=breader.readLine();
            
         }


    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }finally{
        reader.close();
        breader.close();
    }
}

}
