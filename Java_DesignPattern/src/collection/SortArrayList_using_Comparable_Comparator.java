package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList_using_Comparable_Comparator {

	public static void main(String[] args) {

		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(111, "John", 30));
		arraylist.add(new Student(333, "Ronaldo", 31));
		arraylist.add(new Student(222, "Messi", 29));
		arraylist.add(2, new Student(555, "tahir", 45));
		
		Collections.reverse(arraylist);
		Collections.sort(arraylist, Student.comparename);
	//	Collections.sort(arraylist, Student.compaire);
		
		
		
		for (Student str : arraylist) {
			System.out.println(str);
		} 

	}

}
