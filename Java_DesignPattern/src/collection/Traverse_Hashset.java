package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Traverse_Hashset {
public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<String>();
hashSet.add("A");
hashSet.add("B");
hashSet.add("C");
hashSet.add("D");
hashSet.add("E");
hashSet.add("A");
hashSet.add("D");
Iterator<String> iterator = hashSet.iterator();
while (iterator.hasNext()) {
	System.out.println(iterator.next());
	
}
//for(String d:hashSet) {
//	System.out.println(d);
//}
}
}
