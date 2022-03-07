package collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashset {



public static void main(String[] args) {
	Set<String> hashSet = new HashSet<String>();
	
	hashSet.add("a");
	hashSet.add("b");
	hashSet.add("c");
	hashSet.add("b");
	hashSet.add("e");
	
	Object[] array = hashSet.toArray();
	
	
	for (String data: hashSet)
	{
		System.out.println(data);
		
	}
	
	System.out.println(hashSet.contains("e"));
	
	System.out.println(hashSet.contains("e"));
}

}
