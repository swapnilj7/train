package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Convert_LinkedList_To_ArrayList {

public static void main(String[] args) {
	LinkedList<String> linkedlist = new LinkedList<String>();
	 linkedlist.add("Mango");
	    linkedlist.add("Banana"); 
	    linkedlist.add("Pear");
	    linkedlist.add("Apple");
	    linkedlist.add("Orange");
	    
	    ArrayList<String> arrayList = new ArrayList<String>(linkedlist);
	    
	    System.out.println(linkedlist);
	    System.out.println(arrayList);
	    
}
}
