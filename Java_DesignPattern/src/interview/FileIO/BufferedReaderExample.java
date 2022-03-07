package interview.FileIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedReaderExample {  

    public static void main(String args[]) {
     
        //reading file line by line in Java using BufferedReader      
        FileInputStream fis = null;
        BufferedReader reader = null;
     
        try {
            fis = new FileInputStream("D:\\Study\\javaprog\\FileIO\\interview\\file.txt");
            reader = new BufferedReader(new InputStreamReader(fis));
         
            System.out.println("Reading File line by line using BufferedReader");
         
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }          
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
         
        } finally {
            try {
                reader.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  }
}
