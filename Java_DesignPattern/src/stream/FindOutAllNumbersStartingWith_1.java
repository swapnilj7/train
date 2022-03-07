package stream;

import java.util.Arrays;

public class FindOutAllNumbersStartingWith_1 {
public static void main(String[] args) {
	Arrays.asList(10,15,8,49,25,98,32).stream()
	.map(s->s.toString())
	.filter(num->num.startsWith("1"))
	.forEach(System.out::println);
}
}
