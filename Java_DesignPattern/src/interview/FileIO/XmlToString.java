package interview.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class XmlToString {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("D:\\Study\\javaprog\\FileIO\\interview\\pom.xml")));
			
			
			StringBuilder builder = new StringBuilder();
			String readLine = reader.readLine();
			while(readLine!=null) {
				builder.append(readLine).append("\n");
				readLine=reader.readLine();
			}
			String string = builder.toString();
			System.out.println(string);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
