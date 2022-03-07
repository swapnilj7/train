package collection;
import java.util.*;
import java.util.Map.Entry;

 public class TreeMapIteratorExample {
    public static void main(String args[]) {
        
    // Declaring a TreeMap of String keys and String values
    TreeMap<String, String> treemap = new TreeMap<String, String>();
    // Add Key-Value pairs to TreeMap
    treemap.put("Key1", "Pear");
    treemap.put("Key2", "Apple");
    treemap.put("Key3", "Orange");
    treemap.put("Key4", "Papaya");
    treemap.put("Key5", "Banana");
    
    
    // Get Set of entries
    Set set = treemap.entrySet();
    
    // Get iterator
    Iterator it = set.iterator();
    
  while (it.hasNext()) {
	Map.Entry next = (Entry) it.next();
	
	System.out.println(next);
	
}
  
  
  
  }
}