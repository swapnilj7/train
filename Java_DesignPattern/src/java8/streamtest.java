package java8;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;


public class streamtest {




	public static void main(String[] args) {
	//List<Integer> numberlist = Arrays.asList(1,2,3,4,5,6);

	//numberlist.stream().map(num->num*5).forEach(System.out::println);
	
	//Arrays.asList(1,2,3,4,5,6).stream().map(num->num*5).forEach(System.out::println);
	List.of(2,3,4,5,6,78,9,23,4,5).stream().filter(num->num%2==0).forEach(System.out::println);
	
	
	List.of(2,3,4,5,6,78,9,23,4,5).stream();
	Stream.iterate(3,num->num*2).filter(e->e%2==0).limit(10).forEach(System.out::println);
	
	}
	

}
