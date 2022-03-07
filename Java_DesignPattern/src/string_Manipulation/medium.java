package string_Manipulation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class medium {
	// Method to reverse words of a String
    static String reverseWords(String str)
    {
  
        // Specifying the pattern to be searched
        String[] temp = Pattern.compile("\\s").split(str);
  
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        //String[] temp = pattern.split(str);
        String result = "";
  
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
    
    public static void main(String[] args) {
    	 String s1 = "Welcome to Java World";
          System.out.println(reverseWords(s1));
	}
    
	
	
	//Method to reverse  String
//public static void main(String[] args) {
//	Scanner input = new Scanner(System.in);
//	System.out.println("Input:");
//	String string = input.nextLine();
//	string.split("");
//	System.out.println(new StringBuilder(split).reverse());
//}
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>Find duplicate character from string<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
//	 static final int NO_OF_CHARS = 256;
//	 
//	    /* Fills count array with
//	       frequency of characters */
//	    static void fillCharCounts(String str,
//	                                   int[] count)
//	    {
//	        for (int i = 0; i < str.length(); i++) {
//			//	int j = str.charAt(i);
//						count[str.charAt(i)]++;
//			}
//	    }
//	 
//	    /* Print duplicates present
//	      in the passed string */
//	    static void printDups(String str)
//	    {
//	        // Create an array of size
//	        // 256 and fill count of
//	        // every character in it
//	        int count[] = new int[NO_OF_CHARS];
//	        fillCharCounts(str, count);
//	 
//	        for (int i = 0; i < NO_OF_CHARS; i++)
//	            if (count[i] > 1)
//	                System.out.println((char)(i) +
//	                          ", count = " + count[i]);
//	    }
//	 
//	    // Driver Method
//	    public static void main(String[] args)
//	    {
//	        String str = "test string for the first time";
//	        printDups(str);
//	    }
//	
	
	//>>>>>>>>>>>>>>>>find occurence of given character
//	public static void main(String[] args) {
//		String inputdata="Number of vowels in String [sadasdsdd] is ";
//		char findchar='s';
//		int found_count = 0;
//		for(int i=0;i<inputdata.length();i++) {
//			if(inputdata.charAt(i)==findchar)
//			{
//				
//				found_count++;
//			}
//			
//		}
//		System.out.println(found_count);
//		
//		
//	}
	
}
