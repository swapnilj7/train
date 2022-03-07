package interview.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendTesyt {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter(new File("D:\\Study\\javaprog\\FileIO\\interview\\file.txt"),true);
	writer.append("Appendded String");
	writer.close();
	String property = System.getProperty("file.encoding");
	System.out.println(property);
}

}
