package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ex3_findeven {
//static int numlist[]= {1,2,3,4,5,6,8};
public static void main(String[] args) {
	
	
	
	 Arrays.asList(1,2,3,4,5,6,8).stream().filter(n -> n%2 == 0).forEach(System.out::println);
}
}
