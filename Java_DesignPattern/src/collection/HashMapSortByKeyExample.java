package collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMapSortByKeyExample {

	public static <V> void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(3, "A");
		hashMap.put(1, "A");
		hashMap.put(2, "A");
		hashMap.put(5, "A");
		hashMap.put(6, "A");
		
		//Using Set
		 Iterator<Entry<Integer, String>> iterator2 = hashMap.entrySet().iterator();
		 
		//Iterator<Entry<Integer, String>> itr = entrySet.iterator();

		while (iterator2.hasNext()) {
			Entry<Integer, String> next = iterator2.next();

			System.out.println(next.getKey());
		}

		//Using treeMap
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);
		Set<Entry<Integer, String>> set = treeMap.entrySet();

		Iterator<Entry<Integer, String>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey() + " " + next.getValue());
		}

	}

}