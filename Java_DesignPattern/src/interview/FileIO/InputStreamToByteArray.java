/*
 * package interview.FileIO; import java.io.ByteArrayOutputStream; import
 * java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException; import java.io.InputStream;
 * 
 * import org.apache.commons.io.IOUtils;
 * 
 *//**
	 * Java program to convert InputStream to byte array in Java. This Java examples
	 * uses Apache commons IOUtils to create byte array from InputStream and Simply
	 * Java method to convert InputStream to byte array.
	 *
	 * @author Javin Paul
	 *//*
		 * public class InputStreamToByteArray {
		 * 
		 * public static void main(String args[]) throws FileNotFoundException,
		 * IOException {
		 * 
		 * //Converting InputStream to byte array using apche commons IO library int
		 * length = toByteArrayUsingCommons( new
		 * FileInputStream("C:/temp/abc.txt")).length;
		 * 
		 * System.out.
		 * println("Length of byte array created from InputStream in Java using IOUtils : "
		 * + length);
		 * 
		 * 
		 * //Converting InputStream to Byte arrray using Java code length =
		 * toByteArrayUsingJava( new FileInputStream("C:/temp/abc.txt")).length;
		 * System.out.
		 * println("Length of Byte array created from FileInputStream in Java : " +
		 * length);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * Converts InputStream to ByteArray in Java using Apache commons IOUtils class
		 * 
		 * public static byte[] toByteArrayUsingCommons(InputStream is) throws
		 * IOException{ return IOUtils.toByteArray(is); }
		 * 
		 * 
		 * Read bytes from inputStream and writes to OutputStream, later converts
		 * OutputStream to byte array in Java.
		 * 
		 * public static byte[] toByteArrayUsingJava(InputStream is) throws IOException{
		 * ByteArrayOutputStream baos = new ByteArrayOutputStream(); int reads =
		 * is.read();
		 * 
		 * while(reads != -1){ baos.write(reads); reads = is.read(); }
		 * 
		 * return baos.toByteArray();
		 * 
		 * } }
		 */