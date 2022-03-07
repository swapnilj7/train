package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.text.AbstractDocument.Content;
//////Filter names from list based on condition
public class Ex2_List {

	public static void main(String[] args) {
		
		
		
		
		List<Object> list = new ArrayList<>();
		
		
		list.add("swapnil");
		list.add("arun");
		list.add("nikhil");
		list.add("gajab");
		list.add("jasdoasd");
		list.add("tacho");
		list.add("tejas");
		
		
		
		list.stream().filter(n->n.toString().length()<5).collect(Collectors.toList()).forEach(System.out::println);;
		
		
	}
	
}
