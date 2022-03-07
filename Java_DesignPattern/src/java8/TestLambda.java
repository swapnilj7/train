package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Disp{
	public String show(String name,int age);
}
public class TestLambda {

	
	//public static void main(String[] args) {
//	String n="swapnil";
//	
//	Disp disp = (name,age)->{System.out.println("test lambda");
//	return"swapnil 29";
//	};
//	
//
//System.out.println("hello"+disp.show(n,1));
//}

	
//	public static void main(String[] args) {
//	
//ArrayList<String> arrayList = new ArrayList<String>();
//
//arrayList.add("Swapnil");
//arrayList.add("nitesh");
//arrayList.add("hitesh");
//arrayList.add("nikhil");
//arrayList.add("mink");
//arrayList.add("katsuyuki");
//
//arrayList.forEach((name)->{System.out.println(name);});
//Collections.sort(arrayList);
//
//	
//	}
	
	
	
	//sorting name
	
	public static void main(String[] args) {
		 List<Product> list=new ArrayList<Product>();  
	     
	     //Adding Products  
	     list.add(new Product(1,"HP Laptop",25000f));  
	     list.add(new Product(3,"Keyboard",300f));  
	     list.add(new Product(2,"Dell Mouse",150f));  
	     for(Product p:list) {
	    	 System.out.println(p.name);
	     }
	     System.out.println("<<<<<<<<<<<>>>>>>>>>");
	     Collections.sort(list, (p1,p2)->{
	    	 return p1.name.compareTo(p2.name);
	     });
	     for(Product p:list) {
	    	 System.out.println(p.name);
	     }
	     
	}

}


class Product {
	  int id;  
	    String name;  
	    float price;
		public Product(int id, String name, float price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}  


}