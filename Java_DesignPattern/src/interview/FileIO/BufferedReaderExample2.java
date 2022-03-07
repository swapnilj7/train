package interview.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;



public class BufferedReaderExample2 {  

    public static void main(String args[]) {
    	
    	
			 
			try {
				String	bufferedInputStream = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Study\\javaprog\\FileIO\\interview\\file.txt"))).readLine();
				//String readLine = bufferedInputStream.readLine();
				
				while(bufferedInputStream!=null) {
					System.out.println(bufferedInputStream);
					//readLine = bufferedInputStream.readLine();
				
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
    	
    	
    }
}

