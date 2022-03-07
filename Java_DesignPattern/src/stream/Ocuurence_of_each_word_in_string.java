package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ocuurence_of_each_word_in_string {
	public static void main(String[] args) {

		String str = "Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces and enum";

		Long count = Arrays.asList(str.split("\\s")).stream().filter(n -> n.equals("called"))
				.collect(Collectors.counting());
		System.out.println("count of word java=" + count);

		long count2 = str.chars().filter(n -> n == 'a').count();
		System.out.println("count of letter" + count2);
	}
}
