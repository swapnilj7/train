package interview.FileIO;

import java.io.File;
import java.io.IOException;

public class Create_file_and_directory {
public static void main(String[] args) throws IOException {
	boolean mkdir=true;
	
	File directory = new File("D:\\Study\\javaprog\\FileIO\\interview");
	File file = new File(directory.getAbsolutePath()+"\\file.txt");
	System.out.println(directory.getAbsolutePath()+"\n"+file);
	 boolean exists = directory.exists();
	if (!exists) {
		mkdir = directory.mkdir();
		
	}
	else {
		System.out.println("directory exist");
	}
	if(mkdir) {
		file.createNewFile();
		System.out.println("File created");
	}
	else {
		System.out.println("file not created");
	}
}




}
