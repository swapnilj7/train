package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort_ArrayList_descending {
public static void main(String[] args) {
	
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("swapnil");
	arrayList.add("Akash");
	arrayList.add("Rahul");
	arrayList.add("Tejas");
	arrayList.add("Nikhil");
	arrayList.add("Rahul");
	//Comparator<Object> reverseOrder = Collections.reverseOrder();
	Collections.sort(arrayList, Collections.reverseOrder());
	System.out.println(arrayList);
}
}
