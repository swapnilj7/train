package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Calculate_OccurenceOf_EachWord {
	
	public static void main(String[] args) {
		String str="Hello swapnil this java hello world programme welcome to java world";
	
	Map<String,Long> map = Arrays.asList(str.split(" ")).stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(map);
	
	}

}
