package interview.FileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read_lage_file_with_buffread {


	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream inputStream = new FileInputStream("D:\\Study\\javaprog\\FileIO\\interview\\file.txt");
		FileOutputStream destFile = new FileOutputStream("D:\\Study\\javaprog\\FileIO\\interview\\file1.txt");
		
		
		Files.lines(new File("D:\\Study\\javaprog\\FileIO\\interview\\file.txt").toPath()) 
		.map(s -> s.trim()) 
		.filter(s -> !s.isEmpty()) 
		.forEach(System.out::println);

		
		//reading file in string format(convert a file into String )
		String contents = new String(Files.readAllBytes(Paths.get("D:\\Study\\javaprog\\FileIO\\interview\\file.txt"))); 
		System.out.println("Contents (Java 7) : " + contents);

		
	}
}
