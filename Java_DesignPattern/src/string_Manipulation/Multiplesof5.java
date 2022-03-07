package string_Manipulation;

import java.util.List;
import java.util.Arrays;

//import org.apache.poi.hpsf.Array;

public class Multiplesof5 {
public static void main(String[] args) {
List<Integer> numberlist = Arrays.asList(1,2,3,4,5,6);

numberlist.stream().map(num->num*5).forEach(System.out::println);
}
}
