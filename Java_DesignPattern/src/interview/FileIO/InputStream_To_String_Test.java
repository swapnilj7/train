package interview.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class InputStream_To_String_Test {

    public static void main(String args[]) throws FileNotFoundException {
    
        String inputStreamString = new Scanner(new FileInputStream("D:\\Study\\javaprog\\FileIO\\interview\\file.txt"),"UTF-8").useDelimiter("\\A").next();
        System.out.println(inputStreamString);
    }
}

