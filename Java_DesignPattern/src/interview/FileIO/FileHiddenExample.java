package interview.FileIO;

import java.io.File;
import java.io.IOException;

public class FileHiddenExample{

       public static void main(String[] args)throws SecurityException ,IOException{

        File file = new File("C:/HiddenTest.txt");
        if (file.isHidden()) {
           
            System.out.println("This file is Hidden file: ");
        }else {

            System.out.println("File is not Hidden ");
        }
       
  }
}


