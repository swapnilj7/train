package java8;

import java.util.stream.Stream;

public class Stream_Iterating {
public static void main(String[] args) {
	Stream.iterate(14, element->element+1)
										 .filter(element-> element%2 == 0)
										.limit(10)
										.forEach(System.out::println);
}
}
