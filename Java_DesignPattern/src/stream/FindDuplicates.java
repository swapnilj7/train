package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();
	
	Arrays.asList(10,15,8,49,25,98,98,32,15).stream().filter(num->!set.add(num)).forEach(System.out::println);
}
}
