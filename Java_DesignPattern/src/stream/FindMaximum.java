package stream;

import java.util.Arrays;

public class FindMaximum {
	
	public static void main(String[] args) {
		Integer max = Arrays.asList(10,15,8,49,25,98,98,32,15)
				.stream()
				.max(Integer::compare)
				.get();
	
	System.out.println(max);
	
	}
}
