package string_Manipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckStringContainsDigit {
public static void main(String[] args) throws IOException {
	
	StringBuilder stringBuilder = new StringBuilder();
	BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
	String read = string.readLine();
	
	System.out.println(!Pattern.matches(".*[^0-9].*",read));
	
	System.out.println(new StringBuilder(read).reverse());
	String[] split = read.split(" ");
Arrays.asList(split).parallelStream()
			.collect(Collectors.toCollection(LinkedList::new))
			.descendingIterator().forEachRemaining(System.out::print);
	
	
	
	
	
}
}
