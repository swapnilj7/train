package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection1 {
	
	
	

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Iterator<String> i = list.iterator();
		
		while (i.hasNext()) {
		System.out.println(i.next());
			
		}
		
		for(String s:list) {
			System.out.println(">>>>>>>>>>>>>"+s);
		}
		
		Object[] array = list.toArray();
		
		System.out.println(list.contains("z"));
		array[4]="f";
	
		System.out.println(array[4]+"<>"+array.length);
	
	}
	
	
	
}
