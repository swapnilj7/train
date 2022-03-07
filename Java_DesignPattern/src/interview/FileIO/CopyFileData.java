package interview.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CopyFileData {
public static void main(String[] args) throws IOException {
	
	try {
		FileInputStream inputStream = new FileInputStream("D:\\Study\\javaprog\\FileIO\\interview\\file.txt");
		FileOutputStream destFile = new FileOutputStream("D:\\Study\\javaprog\\FileIO\\interview\\file1.txt");
		
		String data = new String(Files.readAllBytes(Paths.get("D:\\Study\\javaprog\\FileIO\\interview\\file.txt")));
		//byte destdata[]=data.getBytes();
		destFile.write(data.getBytes());
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
}
}
