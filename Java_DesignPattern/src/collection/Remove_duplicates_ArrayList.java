package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/*There are two ways to remove duplicates from the ArrayList.

Using HashSet: By using HashSet we can remove the duplicate element from the ArrayList, but it will not then preserve the insertion order.
Using LinkedHashSet: We can also maintain the insertion order by using LinkedHashSet instead of HashSet.
The Process to remove duplicate elements from ArrayList using the LinkedHashSet:

Copy all the elements of ArrayList to LinkedHashSet.
Empty the ArrayList using clear() method, which will remove all the elements from the list.
Now copy all the elements of LinkedHashset to ArrayList.
*/

public class Remove_duplicates_ArrayList {
public static <E> void main(String[] args) {
	
	
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("swapnil");
	arrayList.add("Akash");
	arrayList.add("Rahul");
	arrayList.add("Tejas");
	arrayList.add("Nikhil");
	arrayList.add("Rahul");
	Set<String> linkedHashSet = new LinkedHashSet<String>(arrayList);
	System.out.println(linkedHashSet);
	arrayList.removeAll(arrayList);
	for(String name: linkedHashSet) {
		arrayList.add(name);
		
	}
	
	System.out.println(arrayList);
	
}
	
	
}
