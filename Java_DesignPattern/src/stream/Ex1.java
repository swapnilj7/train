package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Ex1 {
 static Map<String,Integer> product;

public static void main(String[] args) {
	product =new HashMap<String, Integer>();
product.put("pencile", 10);
product.put("book", 100);
product.put("pad", 150);
product.put("pen", 20);
product.put("book", 80);
product.put("book", 50);
product.put("book", 110);


Set<Entry<String,Integer>> set = product.entrySet();

String quote="Before moving ahead, let us build a List of strings ";



 boolean contains = Arrays.asList(quote.split(" ")).contains("us");
 
 
 boolean anyMatch = Arrays.asList(quote.split(" ")).stream().anyMatch(s->s.contentEquals("let"));
 
 System.out.println(anyMatch);
 
 
 System.out.println(contains);

///////////////////Collecting builder pattern input as List//////////////
 Stream.Builder<String> builder = Stream.builder();


Stream<String> build = builder.add("swapnil").add("arun").add("joshi").build();


List<String>list=build.map(String::toUpperCase).collect(Collectors.toList());

System.out.println(list);

///////////////////Collecting builder pattern input  as String////////////// 
String collectAsString = list.stream().map(n->n.toString()).collect(Collectors.joining(" "));

System.out.println(collectAsString);

//boolean filter = asList.stream().filter(s->s.matches("let"));

//System.out.println(asList.contains("letsas"));
//quote.stream().filter


}



}
