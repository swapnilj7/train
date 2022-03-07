package stream;

import java.util.stream.IntStream;

public class Check_If_String_Contains_Digit {
public static void main(String[] args) {
	String str="Sapnilj is my email id";
	
	//IntStream intstream=;
	
	boolean anyMatch = str.chars().anyMatch(ch->Character.isDigit(ch));
	
	
	System.out.println(anyMatch);
	
}
}
