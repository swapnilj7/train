import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Main implements Comparable<Main>{

	private int ind;
	private String name;
	private int year;
	
	@Override
	public int compareTo(Main c) {
		// TODO Auto-generated method stub
		return this.year - c.year;
	}

	public Main(int ind, String name, int year) {
		super();
		this.ind = ind;
		this.name = name;
		this.year = year;
	}

	public int getInd() {
		return ind;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

}
 
 
 

class NameCompare implements Comparator<Main>{

	@Override
	public int compare(Main o1, Main o2) {
		return o1.compareTo(o2);
		
	}
	
	
}


class Idcompare implements Comparator<Main>{

	@Override
	public int compare(Main o1, Main o2) {
		if(o1.getInd() < o2.getInd()) {
			return -1;
		}
		else if (o1.getInd()>o2.getInd()) {
			return 1;
		}
		else if (o1.getInd()==o2.getInd()) {
			return 0;	
		}
		return 0;
	}
	
}


 public class Cmpreimpl {
	
	public static void main(String[] args) {
		List<Main> list = new ArrayList<Main>();
		list.add(new Main(1, "abc", 2001));
		list.add(new Main(3, "clach", 1998));
		list.add(new Main(2, "swap", 1992));
		
		list.add(new Main(4, "spring", 1999));
		
		
		
		Collections.sort(list);
		
		 for (Main movie: list)
	        {
	            System.out.println(movie.getName() + " " +
	                               movie.getInd() + " " +
	                               movie.getYear());
	        }
		
		
		 
		 Idcompare idcmp = new Idcompare();
		 
		 NameCompare nameCompare = new NameCompare();
		 
		 Collections.sort(list, idcmp);
		 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		 for (Main movie: list)
	        {
	            System.out.println(movie.getName() + " " +
	                               movie.getInd() + " " +
	                               movie.getYear());
	        }
		
		 
	}
	
	
}