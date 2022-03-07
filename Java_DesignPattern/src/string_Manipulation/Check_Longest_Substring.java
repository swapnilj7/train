package string_Manipulation;

public class Check_Longest_Substring {

public static void main(String[] args) {
	String str="A string is said to be a palome if it is the same if we start";
	
	String[] split = str.split("\\s");
	int wordindex=0;
	int maxlength = 0;
	for(int i=0;i<split.length;i++)
	{
		if(maxlength<split[i].length())
		{
			maxlength = split[i].length();
			wordindex=i;
		}
	}
	System.out.println(split[wordindex]+"  have max length");
}


	
	
	
}
