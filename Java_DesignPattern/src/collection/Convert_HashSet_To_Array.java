package collection;

import java.util.HashSet;

public class Convert_HashSet_To_Array {
public static <E> void main(String[] args) {
	HashSet<String> hashset = new HashSet<String>();
	hashset.add("Pear");
    hashset.add("Apple");
    hashset.add("Orange");
    hashset.add("Papaya");
    hashset.add("Banana");
    
    String data[]=new String[hashset.size()];
    hashset.toArray(data);
    for(String arraydata:data)
System.out.println(arraydata);

}
}
