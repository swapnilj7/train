package stream;

import java.util.Arrays;

public class FindTotalNumberOfElementsPresentInList {
public static void main(String[] args) {
	long count = Arrays.asList(10,15,8,49,25,98,98,32,15).stream().count();
	
	System.out.println(count);
}
}
