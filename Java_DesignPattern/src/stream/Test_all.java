package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Test_all {
public static void main(String[] args) {
	String str = "Hello Swapnil Joshi";
LinkedHashSet<Object> set = new LinkedHashSet<>();

			boolean match=Arrays.asList(str.split("\\s")).stream ().anyMatch(s->s.contentEquals("Swapnil"));
			System.out.println(match);
			
			Arrays.asList(10,20,20,30,45,12,32,33).stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
			System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
			
			Arrays.asList(10,20,20,30,45,12,32,33).stream().filter(num->!set.add(num)).forEach(System.out::println);
			long count = Arrays.asList(10,20,20,30,45,12,32,33).stream().count();
			System.out.println(count);
			
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
			Arrays.asList(10,20,20,30,45,12,32,33).stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
}
}
