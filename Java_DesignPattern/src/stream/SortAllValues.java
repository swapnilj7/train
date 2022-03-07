package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SortAllValues {
public static void main(String[] args) {
	Arrays.asList(10,15,8,49,25,98,98,32,15).stream().sorted().forEach(System.out::println);
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	Arrays.asList(10,15,8,49,25,98,98,32,15).stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
}
}
