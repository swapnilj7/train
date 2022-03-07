package stream;

import java.util.Arrays;

public class FindFrstElement {
public static void main(String[] args) {
	Arrays.asList(10,15,8,49,25,98,98,32,15).stream()
	.findFirst().ifPresent(System.out::println);
}
}
